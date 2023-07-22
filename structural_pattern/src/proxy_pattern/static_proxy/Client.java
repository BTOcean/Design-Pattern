package proxy_pattern.static_proxy;

import proxy_pattern.static_proxy.proxy.secretary;
import proxy_pattern.static_proxy.subject.Talk;

/**
 * @author xj
 * @version 1.0
 * @className Client
 * @since 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Talk talk = new secretary();
        talk.talk();
    }
}
