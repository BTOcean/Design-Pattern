package factory_method_pattern.demo.concreteProduct;

import factory_method_pattern.demo.abstractProduct.Weapon;

/**
 * @author xj
 * @version 1.0
 * @className Knife
 * @since 1.0
 *
 * 具体工厂角色
 **/
public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("前刺。。。");
    }
}
