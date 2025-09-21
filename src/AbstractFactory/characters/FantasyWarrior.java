package AbstractFactory.characters;

import AbstractFactory.interfaces.GameCharacter;

public class FantasyWarrior implements GameCharacter {
    @Override
    public void attack() {
        System.out.println("Fantasy Warrior swings massive sword with fierce battle cry!");
    }

    @Override
    public void defend() {
        System.out.println("Fantasy Warrior raises enchanted shield, blocking magical attacks");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Fantasy Warrior unleashes 'Berserker Rage' - damage increased by 200%!");
    }

    @Override
    public String getCharacterType() {
        return "Fantasy Warrior";
    }
}
