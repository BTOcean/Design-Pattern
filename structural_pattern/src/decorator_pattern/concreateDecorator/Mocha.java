package decorator_pattern.concreateDecorator;

import decorator_pattern.component.Beverage;
import decorator_pattern.decorator.Decorator;

/**
 * @author xj
 * @version 1.0
 * @className Mocha
 * @since 1.0
 **/
public class Mocha extends Decorator {
    private String description = "加入摩卡";
    private Beverage beverage = null;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription()+description;
    }

    @Override
    public int getPrice(){
        //30表示摩卡的价格
        return beverage.getPrice()+ 30;
    }
}
