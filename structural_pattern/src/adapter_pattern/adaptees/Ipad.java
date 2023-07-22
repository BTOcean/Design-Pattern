package adapter_pattern.adaptees;

/**
 * @author xj
 * @version 1.0
 * @className Ipad
 * @since 1.0
 **/
public class Ipad {
    /**
     * 平板只有方形接口
     */
    public void sequareShapeInterface(int interfaceShape) {
        if (interfaceShape == 0) {
            System.out.println("Ipad对接成功");
        } else {
            System.out.println("接口形状对不上啊！");
        }
    }

}
