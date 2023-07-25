package observe_pattern.listeners;

import observe_pattern.listener.EventListenter;

/**
 * @author xj
 * @version 1.0
 * @className LogListenter具体监听者
 * @since 1.0
 **/
public class LogListenter implements EventListenter {
    @Override
    public void update(String eventType) {
        System.out.println("LogListen---->" + eventType);
    }
}
