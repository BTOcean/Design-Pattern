package factory_method_pattern.demo;

import factory_method_pattern.demo.abstractFactory.WeaponFactory;
import factory_method_pattern.demo.abstractProduct.Weapon;
import factory_method_pattern.demo.concreteFactory.GunFactory;

/**
 * @author xj
 * @version 1.0
 * @className Client
 * @since 1.0
 **/
public class Client {
    public static void main(String[] args) {
        //这里的 new GunFactory 可以 使用xml配置文件，使用DOM机制 动态读取获得对应的工厂
        WeaponFactory weaponFactory = new GunFactory();
        Weapon weapon = weaponFactory.makeWeapon();
        weapon.attack();
    }
}
