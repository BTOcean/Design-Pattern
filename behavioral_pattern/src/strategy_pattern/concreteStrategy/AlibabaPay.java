package strategy_pattern.concreteStrategy;

import strategy_pattern.abstractStrategy.Payment;

/**
 * @author xj
 * @version 1.0
 * @className AlibabaPay
 * @since 1.0
 **/
public class AlibabaPay implements Payment {
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
