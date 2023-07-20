package prototype_pattern.shallow_copy;

import prototype_pattern.SomeReference;

/**
 * @author xj
 * @version 1.0
 * @className ShallowCopy
 * @since 1.0
 **/
public class ShallowCopy implements Cloneable{
    private int basicVar;
    private SomeReference obj;

    public ShallowCopy(int basicVar, SomeReference obj) {
        this.basicVar = basicVar;
        this.obj = obj;
    }

    public SomeReference getObj() {
        return obj;
    }

    @Override
    protected ShallowCopy clone() throws CloneNotSupportedException {
        return (ShallowCopy) super.clone();
    }

    @Override
    public String toString() {
        return "ShallowCopy{" +
                "basicVar=" + basicVar +
                ", obj=" + obj +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCopy shallowCopy1 = new ShallowCopy(100, new SomeReference());
        ShallowCopy shallowCopy2 = shallowCopy1.clone();
        System.out.println(shallowCopy1 + "----" +shallowCopy1.hashCode());
        System.out.println(shallowCopy2 + "----" +shallowCopy2.hashCode());
        System.out.println(shallowCopy1.getObj() == shallowCopy2.getObj());
    }
}
