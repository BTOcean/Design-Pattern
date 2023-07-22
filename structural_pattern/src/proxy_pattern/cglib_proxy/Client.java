package proxy_pattern.cglib_proxy;


import net.sf.cglib.proxy.Enhancer;
import proxy_pattern.cglib_proxy.proxy.Secretary;
import proxy_pattern.cglib_proxy.realsubject.Boss;

/**
 * @author xj
 * @version 1.0
 * @className Client
 * @since 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Boss.class);
        enhancer.setCallback(new Secretary());
        Boss o = (Boss)enhancer.create();
        System.out.println(o.getClass());

        o.talk();
    }
}
