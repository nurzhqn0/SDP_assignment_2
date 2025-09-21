package AbstractFactory.factories;

import AbstractFactory.characters.FantasyWarrior;
import AbstractFactory.environments.FantasyForest;
import AbstractFactory.interfaces.GameCharacter;
import AbstractFactory.interfaces.GameEnvironment;
import AbstractFactory.interfaces.GameThemeFactory;
import AbstractFactory.interfaces.GameWeapon;
import AbstractFactory.weapons.FantasySword;

public class FantasyGameFactory implements GameThemeFactory {
    @Override
    public GameCharacter createCharacter() {
        System.out.println("Fantasy Factory: Creating mystical warrior from ancient legends");
        return new FantasyWarrior();
    }

    @Override
    public GameWeapon createWeapon() {
        System.out.println("Fantasy Factory: Forging enchanted blade with dragon steel");
        return new FantasySword();
    }

    @Override
    public GameEnvironment createEnvironment() {
        System.out.println("Fantasy Factory: Conjuring magical forest realm");
        return new FantasyForest();
    }

    @Override
    public String getThemeName() {
        return "Fantasy Medieval Theme";
    }
}
