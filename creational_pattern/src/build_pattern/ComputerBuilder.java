package build_pattern;

import build_pattern.product.Computer;

public interface ComputerBuilder {
    void setUsbCount();

    void setScreen();

    void setKeyboard();

    Computer getComputer();
}
