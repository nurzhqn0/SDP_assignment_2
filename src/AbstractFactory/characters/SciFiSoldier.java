package AbstractFactory.characters;

import AbstractFactory.interfaces.GameCharacter;

public class SciFiSoldier implements GameCharacter {
    @Override
    public void attack() {
        System.out.println("Sci-Fi Soldier fires plasma rifle with precision targeting!");
    }

    @Override
    public void defend() {
        System.out.println("Sci-Fi Soldier activates energy shield and tactical armor");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Sci-Fi Soldier activates 'Tactical Nuke' - area devastation!");
    }

    @Override
    public String getCharacterType() {
        return "Sci-Fi Combat Soldier";
    }
}
