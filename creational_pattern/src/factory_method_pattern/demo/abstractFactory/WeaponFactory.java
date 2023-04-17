package factory_method_pattern.demo.abstractFactory;

import factory_method_pattern.demo.abstractProduct.Weapon;

/**
 * 抽象工厂角色
 */
public interface WeaponFactory {
    public Weapon makeWeapon();
}
