package AbstractFactory.interfaces;

public interface GameWeapon {
    void strike();
    void reload();
    int getDamage();
    String getWeaponType();
}
