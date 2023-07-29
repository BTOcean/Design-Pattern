package strategy_pattern.concreteStrategy;

import strategy_pattern.abstractStrategy.Payment;

/**
 * @author xj
 * @version 1.0
 * @className WeChatPay
 * @since 1.0
 **/
public class WeChatPay implements Payment {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
