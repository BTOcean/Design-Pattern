package decorator_pattern.concreateDecorator;

import decorator_pattern.component.Beverage;
import decorator_pattern.decorator.Decorator;

/**
 * @author xj
 * @version 1.0
 * @className MikeCoffee
 * @since 1.0
 **/
public class Mike extends Decorator {
    private final static String description = "加入牛奶";
    private Beverage beverage = null;

    public Mike(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+description;
    }

    @Override
    public int getPrice() {
        //牛奶20
        return beverage.getPrice() + 20;
    }
}
