package AbstractFactory.weapons;

import AbstractFactory.interfaces.GameWeapon;

public class ModernRifle implements GameWeapon {
    @Override
    public void strike() {
        System.out.println("Assault rifle fires rapid burst with military precision!");
    }

    @Override
    public void reload() {
        System.out.println("Swapping magazine and checking weapon systems");
    }

    @Override
    public int getDamage() {
        return 75;
    }

    @Override
    public String getWeaponType() {
        return "Military Assault Rifle";
    }
}