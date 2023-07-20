package build_pattern.product;

/**
 * @author xj
 * @version 1.0
 * @className Computer
 * @since 1.0
 **/
public class Computer {
    private String cpu;
    private int usbCount;
    private String screen;
    private String keyboard;

    public Computer(String cpu) {
        this.cpu = cpu;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", usbCount=" + usbCount +
                ", screen='" + screen + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getUsbCount() {
        return usbCount;
    }

    public void setUsbCount(int usbCount) {
        this.usbCount = usbCount;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
}
