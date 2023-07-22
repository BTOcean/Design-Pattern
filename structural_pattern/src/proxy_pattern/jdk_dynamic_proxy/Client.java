package proxy_pattern.jdk_dynamic_proxy;

import proxy_pattern.jdk_dynamic_proxy.proxy.Secretary;
import proxy_pattern.jdk_dynamic_proxy.realsubject.Boss;
import proxy_pattern.jdk_dynamic_proxy.subject.Talk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author xj
 * @version 1.0
 * @className Client
 * @since 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Boss boss = new Boss();
        InvocationHandler invocationHandler = new Secretary(boss);
        Talk talk = (Talk) Proxy.newProxyInstance(
                boss.getClass().getClassLoader(),
                new Class[]{Talk.class},
                invocationHandler);
        System.out.println(talk.getClass());
        talk.talk();
    }
}
