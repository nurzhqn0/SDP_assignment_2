package AbstractFactory.settings;

import AbstractFactory.interfaces.GameCharacter;
import AbstractFactory.interfaces.GameEnvironment;
import AbstractFactory.interfaces.GameThemeFactory;
import AbstractFactory.interfaces.GameWeapon;

public class GameSession {
    private final GameThemeFactory themeFactory;
    private GameCharacter character;
    private GameWeapon weapon;
    private GameEnvironment environment;

    public GameSession(GameThemeFactory factory) {
        this.themeFactory = factory;
        initializeGame();
    }

    private void initializeGame() {
        System.out.println("Initializing game with " + themeFactory.getThemeName());

        character = themeFactory.createCharacter();
        weapon = themeFactory.createWeapon();
        environment = themeFactory.createEnvironment();
    }

    public void startGame() {
        System.out.println("\n=== Starting Game Session ===");
        System.out.println("Theme: " + themeFactory.getThemeName());

        System.out.println("\n--- Environment Setup ---");
        environment.render();
        environment.playBackgroundMusic();
        environment.setWeatherEffect();

        System.out.println("\n--- Character Introduction ---");
        System.out.println("Player character: " + character.getCharacterType());
        System.out.println("Equipped weapon: " + weapon.getWeaponType() + " (Damage: " + weapon.getDamage() + ")");

        System.out.println("\n--- Combat Simulation ---");
        character.attack();
        weapon.strike();
        character.useSpecialAbility();
        character.defend();
        weapon.reload();

        System.out.println("\nGame session completed successfully!");
        System.out.println("===============================");
    }

    public void demonstrateThemeConsistency() {
        System.out.println("\n=== Theme Consistency Check ===");
        System.out.printf("Character: %s%n", character.getCharacterType());
        System.out.printf("Weapon: %s%n", weapon.getWeaponType());
        System.out.printf("Environment: %s%n", environment.getEnvironmentType());
        System.out.printf("All components belong to: %s%n", themeFactory.getThemeName());
        System.out.println("Theme consistency: VERIFIED ✓");
    }
}
