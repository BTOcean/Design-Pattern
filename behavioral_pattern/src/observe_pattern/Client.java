package observe_pattern;

import observe_pattern.listeners.EmailNotificcationListener;
import observe_pattern.listeners.LogListenter;
import observe_pattern.publishers.Editor;

/**
 * @author xj
 * @version 1.0
 * @className Client
 * @since 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.eventManager.subscribe("open", new LogListenter());
        editor.eventManager.subscribe("save", new EmailNotificcationListener());

        editor.open();
        editor.save();
    }
}
