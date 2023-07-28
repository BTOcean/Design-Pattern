package template_method_pattern.abstractclass;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author xj
 * @version 1.0
 * @className Network
 * @since 1.0
 **/
public abstract class Network extends AbstractQueuedSynchronizer{
    String account;
    String password;
    public Network() {
    }

    /**
     * 推送动态、信息、视频
     * @return
     */
    public final boolean push(String message) {
        if (login(account, password)) {
            sendData(message.getBytes(StandardCharsets.UTF_8));

            beforeLogOutDoSomething();
            logOut();
            return true;
        }
        return false;
    }

    public abstract boolean login(String account, String password);

    public abstract boolean sendData(byte[] data);

    public void beforeLogOutDoSomething() {
        System.out.println("退出之前不干什么。");
    }

    public abstract boolean logOut();
}
