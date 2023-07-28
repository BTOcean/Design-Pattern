package template_method_pattern.concreteclass;

import template_method_pattern.abstractclass.Network;

/**
 * @author xj
 * @version 1.0
 * @className Twitter
 * @since 1.0
 **/
public class Twitter extends Network {
    public Twitter(String account, String password) {

    }

    @Override
    public boolean login(String account, String password) {
        System.out.println("登录成功");
        return true;
    }

    @Override
    public boolean sendData(byte[] data) {
        System.out.println("发送数据中");
        return true;
    }

    @Override
    public void beforeLogOutDoSomething() {
        System.out.println("退出登录前，缓存一下最后一个页面");
    }

    @Override
    public boolean logOut() {
        System.out.println("退出登录");
        return false;
    }
}
