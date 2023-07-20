package build_pattern;

/**
 * @author xj
 * @version 1.0
 * @className Director 管理者、管家
 * @since 1.0
 **/
public class Director {
    public void makeComputer(ComputerBuilder builder) {
        builder.setUsbCount();
        builder.setScreen();
        builder.setKeyboard();
    }
}
