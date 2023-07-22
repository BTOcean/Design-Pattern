package adapter_pattern.target;

/**
 * @author xj
 * @version 1.0
 * @className Headset耳机
 * @since 1.0
 **/
public class Headset {
    /**
     * 只能插入圆形接口
     * @Param shape 0->RoundShape、1->SequareShape
     * @return
     */
    private int shapeOfInterFace = 0;
    public boolean insert(int shape) {
        if (shape != 0) {
            System.out.println("接口形状不同，对接不上啊");
            return false;
        }
        System.out.println("耳机对接成功");
        return true;
    }

    public int getShapeOfInterFace() {
        return shapeOfInterFace;
    }
}
