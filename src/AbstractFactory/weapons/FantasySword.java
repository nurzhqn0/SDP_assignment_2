package AbstractFactory.weapons;

import AbstractFactory.interfaces.GameWeapon;

public class FantasySword implements GameWeapon {
    @Override
    public void strike() {
        System.out.println("Enchanted sword glows with mystical energy as it strikes!");
    }

    @Override
    public void reload() {
        System.out.println("Sword channels magical energy from ancient runes");
    }

    @Override
    public int getDamage() {
        return 85;
    }

    @Override
    public String getWeaponType() {
        return "Enchanted Fantasy Sword";
    }
}
