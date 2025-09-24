package AbstractFactory.settings;

import AbstractFactory.factories.FantasyGameFactory;
import AbstractFactory.factories.ModernGameFactory;
import AbstractFactory.factories.SciFiGameFactory;
import AbstractFactory.interfaces.GameThemeFactory;

public class GameThemeProvider {

    public enum Theme {
        FANTASY,
        SCIFI,
        MODERN
    }

    public static GameThemeFactory getFactory(Theme theme) {
        if (theme == null) {
            throw new IllegalArgumentException("Theme cannot be null");
        }

        switch (theme) {
            case FANTASY:
                return new FantasyGameFactory();
            case SCIFI:
                return new SciFiGameFactory();
            case MODERN:
                return new ModernGameFactory();
            default:
                throw new IllegalArgumentException("Unsupported theme: " + theme);
        }
    }

    public static GameThemeFactory getFactory(String themeName) {
        if (themeName == null || themeName.trim().isEmpty()) {
            throw new IllegalArgumentException("Theme name cannot be null or empty");
        }

        try {
            Theme theme = Theme.valueOf(themeName.toUpperCase());
            return getFactory(theme);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid theme name: " + themeName, e);
        }
    }
}
