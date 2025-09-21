package AbstractFactory;

import AbstractFactory.interfaces.GameThemeFactory;
import AbstractFactory.settings.GameSession;
import AbstractFactory.settings.GameThemeProvider;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        System.out.println("Abstract Factory Pattern Demo - Gaming Platform System");
        System.out.println("======================================================");

        // Test all game themes
        GameThemeProvider.Theme[] themes = {
                GameThemeProvider.Theme.FANTASY,
                GameThemeProvider.Theme.SCIFI,
                GameThemeProvider.Theme.MODERN
        };

        for (GameThemeProvider.Theme theme : themes) {
            System.out.println("\n" + "=".repeat(60));
            System.out.println("Testing " + theme + " Theme");
            System.out.println("=".repeat(60));

            GameThemeFactory factory = GameThemeProvider.getFactory(theme);
            GameSession gameSession = new GameSession(factory);
            gameSession.startGame();
            gameSession.demonstrateThemeConsistency();
        }

        // Test string-based factory selection
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Testing String-based Factory Selection");
        System.out.println("=".repeat(60));

        try {
            GameThemeFactory stringFactory = GameThemeProvider.getFactory("fantasy");
            System.out.println("Successfully created factory: " + stringFactory.getThemeName());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Test error handling
        System.out.println("\n=== Error Handling Test ===");
        try {
            GameThemeProvider.getFactory((GameThemeProvider.Theme) null);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }

        try {
            GameThemeProvider.getFactory("invalid_theme");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }

        System.out.println("\nDemo completed successfully!");
    }
}
