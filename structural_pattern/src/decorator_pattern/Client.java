package decorator_pattern;

import decorator_pattern.component.Beverage;
import decorator_pattern.concreateComponent.CoffeeBean1;
import decorator_pattern.concreateDecorator.Mike;
import decorator_pattern.concreateDecorator.Mocha;

/**
 * @author xj
 * @version 1.0
 * @className Client
 * @since 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Beverage beverage = new CoffeeBean1();
        System.out.println(beverage.getPrice());

        beverage = new Mike(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.getPrice());

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.getPrice());
    }
}
