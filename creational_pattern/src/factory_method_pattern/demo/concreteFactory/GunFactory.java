package factory_method_pattern.demo.concreteFactory;

import factory_method_pattern.demo.abstractFactory.WeaponFactory;
import factory_method_pattern.demo.abstractProduct.Weapon;
import factory_method_pattern.demo.concreteProduct.Gun;

/**
 * @author xj
 * @version 1.0
 * @className GunFactory
 * @since 1.0
 *
 * 具体工厂角色
 **/
public class GunFactory implements WeaponFactory {

    @Override
    public Weapon makeWeapon() {
        System.out.println("生成枪。。。。");
        return new Gun();
    }
}
