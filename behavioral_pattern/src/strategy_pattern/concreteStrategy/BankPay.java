package strategy_pattern.concreteStrategy;

import strategy_pattern.abstractStrategy.Payment;

/**
 * @author xj
 * @version 1.0
 * @className BankPay
 * @since 1.0
 **/
public class BankPay implements Payment {
    @Override
    public void pay() {
        System.out.println("银行卡支付");
    }
}
