package build_pattern;

import build_pattern.product.Computer;

/**
 * @author xj
 * @version 1.0
 * @className MacComputerBuilder
 * @since 1.0
 **/
public class MacComputerBuilder implements ComputerBuilder{
    private Computer computer;
    public MacComputerBuilder(String cpu) {
        computer = new Computer(cpu);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

    @Override
    public void setScreen() {
        computer.setScreen("苹果显示屏");
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("苹果键盘");
    }
}
