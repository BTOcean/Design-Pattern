package observe_pattern.publisher;

import observe_pattern.listener.EventListenter;

import java.util.*;

/**
 * @author xj
 * @version 1.0
 * @className EventManager抽象发布者
 * @since 1.0
 **/
public class EventManager {
    Map<String, List<EventListenter>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListenter listener) {
        List<EventListenter> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListenter listener) {
        List<EventListenter> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType) {
        List<EventListenter> users = listeners.get(eventType);
        for (EventListenter listener : users) {
            listener.update(eventType);
        }
    }
}
