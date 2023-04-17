package factory_method_pattern.demo.concreteProduct;

import factory_method_pattern.demo.abstractProduct.Weapon;

/**
 * @author xj
 * @version 1.0
 * @className Gun
 * @since 1.0
 *
 * 具体产品角色
 **/
public class Gun implements Weapon {

    @Override
    public void attack() {
        System.out.println("射击。。。哒哒哒");
    }
}
