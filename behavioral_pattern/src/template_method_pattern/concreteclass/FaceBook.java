package template_method_pattern.concreteclass;

import template_method_pattern.abstractclass.Network;

/**
 * @author xj
 * @version 1.0
 * @className FaceBook
 * @since 1.0
 **/
public class FaceBook extends Network {
    public FaceBook(String account, String password) {

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
    public boolean logOut() {
        System.out.println("退出登录");
        return false;
    }
}
