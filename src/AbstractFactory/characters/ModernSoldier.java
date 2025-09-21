package AbstractFactory.characters;

import AbstractFactory.interfaces.GameCharacter;

public class ModernSoldier implements GameCharacter {
    @Override
    public void attack() {
        System.out.println("Modern Soldier fires assault rifle with tactical precision!");
    }

    @Override
    public void defend() {
        System.out.println("Modern Soldier takes cover behind ballistic vest and helmet");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Modern Soldier calls in 'Air Strike' - coordinated military assault!");
    }

    @Override
    public String getCharacterType() {
        return "Modern Military Soldier";
    }
}
