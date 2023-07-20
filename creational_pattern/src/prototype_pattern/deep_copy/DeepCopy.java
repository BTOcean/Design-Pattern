package prototype_pattern.deep_copy;

import prototype_pattern.DeepCopyReference;
import prototype_pattern.SomeReference;

/**
 * @author xj
 * @version 1.0
 * @className DeepCopy
 * @since 1.0
 **/
public class DeepCopy implements Cloneable{
    private int basicVar;
    //需要实现Cloneable接口以及重写clone
    private DeepCopyReference deepCopyReference;

    public DeepCopy(int basicVar, DeepCopyReference deepCopyReference) {
        this.basicVar = basicVar;
        this.deepCopyReference = deepCopyReference;
    }

    public DeepCopyReference getDeepCopyReference() {
        return deepCopyReference;
    }

    @Override
    public String toString() {
        return "DeepCopy{" +
                "basicVar=" + basicVar +
                ", deepCopyReference=" + deepCopyReference +
                '}';
    }

    @Override
    protected DeepCopy clone() throws CloneNotSupportedException {
        DeepCopy deepCopy = null;
        deepCopy = (DeepCopy) super.clone();
        deepCopy.deepCopyReference = (DeepCopyReference) deepCopyReference.clone();
        return deepCopy;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCopy deepCopy1 = new DeepCopy(1000, new DeepCopyReference());
        DeepCopy deepCopy2 = deepCopy1.clone();
        System.out.println(deepCopy1 + "----" + deepCopy1.hashCode());
        System.out.println(deepCopy2 + "----" + deepCopy2.hashCode());

        System.out.println(deepCopy1.getDeepCopyReference().hashCode());
        System.out.println(deepCopy2.getDeepCopyReference().hashCode());
        System.out.println(deepCopy1.getDeepCopyReference() == deepCopy2.getDeepCopyReference());
    }
}
