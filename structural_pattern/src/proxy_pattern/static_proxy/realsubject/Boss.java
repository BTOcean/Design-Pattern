package proxy_pattern.static_proxy.realsubject;

import proxy_pattern.static_proxy.subject.Talk;

/**
 * @author xj
 * @version 1.0
 * @className Boss
 * @since 1.0
 **/
public class Boss implements Talk {
    @Override
    public void talk() {
        System.out.println("老板谈话");
    }
}
