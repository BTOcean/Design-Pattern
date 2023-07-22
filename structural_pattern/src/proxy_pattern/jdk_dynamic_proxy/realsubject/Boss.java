package proxy_pattern.jdk_dynamic_proxy.realsubject;

import proxy_pattern.jdk_dynamic_proxy.subject.Talk;

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
