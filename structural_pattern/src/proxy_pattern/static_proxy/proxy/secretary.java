package proxy_pattern.static_proxy.proxy;

import proxy_pattern.static_proxy.realsubject.Boss;
import proxy_pattern.static_proxy.subject.Talk;

/**
 * @author xj
 * @version 1.0
 * @className secretary
 * @since 1.0
 **/
public class secretary implements Talk {
    private Boss boss = new Boss();
    @Override
    public void talk() {
        System.out.println("秘书谈话，同意见老板");
        boss.talk();
    }
}
