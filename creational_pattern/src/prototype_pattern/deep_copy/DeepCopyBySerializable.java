package prototype_pattern.deep_copy;

import prototype_pattern.DeepCopyBySerializableReference;

import java.io.*;

/**
 * @author xj
 * @version 1.0
 * @className DeepCopyBySerializable
 * @since 1.0
 **/
public class DeepCopyBySerializable implements Serializable {
    private int a = 100;
    private DeepCopyBySerializableReference deepCopyBySerializableReference;

    public DeepCopyBySerializable(int a, DeepCopyBySerializableReference deepCopyBySerializableReference) {
        this.a = a;
        this.deepCopyBySerializableReference = deepCopyBySerializableReference;
    }

    public DeepCopyBySerializable myclone() {
        DeepCopyBySerializable deepCopyBySerializable = null;
        try {
            //将对象序列化到流里
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(this);
            //将流反序列化成对象
            ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(is);
            deepCopyBySerializable = (DeepCopyBySerializable) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deepCopyBySerializable;
    }

    @Override
    public String toString() {
        return "DeepCopyBySerializable{" +
                "a=" + a +
                ", deepCopyBySerializableReference=" + deepCopyBySerializableReference +
                '}';
    }

    public DeepCopyBySerializableReference getDeepCopyBySerializableReference() {
        return deepCopyBySerializableReference;
    }

    public static void main(String[] args) {
        DeepCopyBySerializable obj1 = new DeepCopyBySerializable(100, new DeepCopyBySerializableReference());
        DeepCopyBySerializable obj2 = obj1.myclone();
        System.out.println(obj1 + "----" + obj1.hashCode());
        System.out.println(obj2 + "----" + obj2.hashCode());
        System.out.println(obj1.getDeepCopyBySerializableReference().hashCode());
        System.out.println(obj2.getDeepCopyBySerializableReference().hashCode());
    }
}
