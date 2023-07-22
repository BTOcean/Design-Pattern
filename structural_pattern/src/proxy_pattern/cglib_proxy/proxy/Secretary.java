package proxy_pattern.cglib_proxy.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xj
 * @version 1.0
 * @className secretary
 * @since 1.0
 **/
public class Secretary implements MethodInterceptor {

    /**
     *
     * @param o 表示要进行增强的对象
     * @param method 表示拦截的方法
     * @param objects 数组表示参数列表，基本数据类型需要传入其包装类型，如int-->Integer、long-Long、double-->Double
     * @param methodProxy 表示对方法的代理，invokeSuper方法表示对被代理对象方法的调用
     * @return 执行结果
     * @throws Throwable 异常
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("和老板谈话前，先和俺谈");
        Object result = methodProxy.invokeSuper(o, objects);
        return result;
    }
}
