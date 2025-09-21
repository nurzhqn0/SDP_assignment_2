package AbstractFactory.factories;

import AbstractFactory.characters.SciFiSoldier;
import AbstractFactory.environments.SciFiSpaceStation;
import AbstractFactory.interfaces.GameCharacter;
import AbstractFactory.interfaces.GameEnvironment;
import AbstractFactory.interfaces.GameThemeFactory;
import AbstractFactory.interfaces.GameWeapon;
import AbstractFactory.weapons.SciFiBlaster;

public class SciFiGameFactory implements GameThemeFactory {
    @Override
    public GameCharacter createCharacter() {
        System.out.println("Sci-Fi Factory: Manufacturing advanced combat unit");
        return new SciFiSoldier();
    }

    @Override
    public GameWeapon createWeapon() {
        System.out.println("Sci-Fi Factory: Assembling high-tech plasma weaponry");
        return new SciFiBlaster();
    }

    @Override
    public GameEnvironment createEnvironment() {
        System.out.println("Sci-Fi Factory: Constructing futuristic space environment");
        return new SciFiSpaceStation();
    }

    @Override
    public String getThemeName() {
        return "Science Fiction Theme";
    }
}