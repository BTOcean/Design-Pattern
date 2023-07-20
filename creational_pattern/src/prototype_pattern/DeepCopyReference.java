package prototype_pattern;

/**
 * @author xj
 * @version 1.0
 * @className DeepCopyReference
 * @since 1.0
 **/
public class DeepCopyReference implements Cloneable{
    public DeepCopyReference(){}

    @Override
    public DeepCopyReference clone() throws CloneNotSupportedException {
        return (DeepCopyReference) super.clone();
    }
}
