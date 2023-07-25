package observe_pattern.publishers;

import observe_pattern.publisher.EventManager;

/**
 * @author xj
 * @version 1.0
 * @className Editor具体发布者
 * @since 1.0
 **/
public class Editor{
    public EventManager eventManager;
    public Editor(){
        this.eventManager = new EventManager("open", "save");
    }

    public void open() {
        eventManager.notify("open");
    }

    public void save() {
        eventManager.notify("save");
    }
}
