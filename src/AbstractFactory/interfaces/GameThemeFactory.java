package AbstractFactory.interfaces;

public interface GameThemeFactory {
    GameCharacter createCharacter();
    GameWeapon createWeapon();
    GameEnvironment createEnvironment();
    String getThemeName();
}