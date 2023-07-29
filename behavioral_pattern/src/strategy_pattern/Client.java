package strategy_pattern;

import strategy_pattern.concreteStrategy.AlibabaPay;
import strategy_pattern.context.PayMentContext;

/**
 * @author xj
 * @version 1.0
 * @className Client
 * @since 1.0
 **/
public class Client {
    public static void main(String[] args) {
        PayMentContext payMentContext = new PayMentContext();
        payMentContext.setPayment(new AlibabaPay());
        payMentContext.pay();
    }
}
