package proxy_pattern.jdk_dynamic_proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xj
 * @version 1.0
 * @className secretary
 * @since 1.0
 **/
public class Secretary implements InvocationHandler {
    private Object obj;

    public Secretary(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("俺是秘书，同意你和老板谈话");
        Object result = method.invoke(this.obj, args);
        return result;
    }

}
