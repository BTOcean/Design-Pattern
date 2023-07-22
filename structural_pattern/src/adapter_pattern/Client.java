package adapter_pattern;

import adapter_pattern.adaptees.Ipad;
import adapter_pattern.adapters.HeadsetApdater;
import adapter_pattern.target.Headset;

/**
 * @author xj
 * @version 1.0
 * @className Client
 * @since 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Headset headset = new Headset();
        HeadsetApdater headsetApdater = new HeadsetApdater();
        headsetApdater.sequareShapeInterface(headset.getShapeOfInterFace());
    }

}
