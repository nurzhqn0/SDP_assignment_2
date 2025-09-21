package AbstractFactory.factories;

import AbstractFactory.characters.ModernSoldier;
import AbstractFactory.environments.ModernCity;
import AbstractFactory.interfaces.GameCharacter;
import AbstractFactory.interfaces.GameEnvironment;
import AbstractFactory.interfaces.GameThemeFactory;
import AbstractFactory.interfaces.GameWeapon;
import AbstractFactory.weapons.ModernRifle;

public class ModernGameFactory implements GameThemeFactory {
    @Override
    public GameCharacter createCharacter() {
        System.out.println("Modern Factory: Training contemporary military personnel");
        return new ModernSoldier();
    }

    @Override
    public GameWeapon createWeapon() {
        System.out.println("Modern Factory: Manufacturing military-grade firearms");
        return new ModernRifle();
    }

    @Override
    public GameEnvironment createEnvironment() {
        System.out.println("Modern Factory: Building realistic urban battlefield");
        return new ModernCity();
    }

    @Override
    public String getThemeName() {
        return "Modern Warfare Theme";
    }
}
