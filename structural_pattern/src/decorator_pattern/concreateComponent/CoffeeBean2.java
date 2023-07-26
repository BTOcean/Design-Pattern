package decorator_pattern.concreateComponent;

import decorator_pattern.component.Beverage;

/**
 * @author xj
 * @version 1.0
 * @className CoffeeBean1
 * @since 1.0
 **/
public class CoffeeBean2 implements Beverage {
    private final static String description = "第二种coffer豆";
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
