package adapter_pattern.adapters;

import adapter_pattern.adaptees.Ipad;
import adapter_pattern.target.Headset;

/**
 * @author xj
 * @version 1.0
 * @className HeadsetApdater
 * @since 1.0
 **/
public class HeadsetApdater extends Ipad {
    private static final int sequareShapeInterface = 1;
    private static final int roundShapeInterface = 0;
    Headset headset = new Headset();
    @Override
    public void sequareShapeInterface(int interfaceShape) {
        //适配器对接耳机
        headset.insert(roundShapeInterface);
        //适配器对接Ipad
        super.sequareShapeInterface(interfaceShape);
        System.out.println("耳机和Ipad对接成功");
    }
}
