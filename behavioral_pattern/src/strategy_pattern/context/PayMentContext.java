package strategy_pattern.context;

import strategy_pattern.abstractStrategy.Payment;

/**
 * @author xj
 * @version 1.0
 * @className PayMentContext
 * @since 1.0
 **/
public class PayMentContext {
    private Payment payment;

    public PayMentContext() {
    }

    public PayMentContext(Payment payment) {
        this.payment = payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void pay() {
        if (payment == null) {
            System.out.println("未选择支付方式");
            return;
        }
        payment.pay();
    }
}
