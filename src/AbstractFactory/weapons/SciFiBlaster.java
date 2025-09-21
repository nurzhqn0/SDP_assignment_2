package AbstractFactory.weapons;

import AbstractFactory.interfaces.GameWeapon;

public class SciFiBlaster implements GameWeapon {
    @Override
    public void strike() {
        System.out.println("Plasma blaster fires concentrated energy beam!");
    }

    @Override
    public void reload() {
        System.out.println("Recharging plasma cells and cooling weapon systems");
    }

    @Override
    public int getDamage() {
        return 95;
    }

    @Override
    public String getWeaponType() {
        return "Advanced Plasma Blaster";
    }
}
