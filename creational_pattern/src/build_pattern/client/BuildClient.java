package build_pattern.client;

import build_pattern.ComputerBuilder;
import build_pattern.Director;
import build_pattern.MacComputerBuilder;
import build_pattern.product.Computer;

/**
 * @author xj
 * @version 1.0
 * @className BuildClient
 * @since 1.0
 **/
public class BuildClient {
    public static void main(String[] args) {
        Director director = new Director();
        ComputerBuilder builder = new MacComputerBuilder("CPU");
        director.makeComputer(builder);
        Computer computer = builder.getComputer();
        System.out.println(computer);
    }
}
