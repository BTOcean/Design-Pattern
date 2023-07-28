package template_method_pattern;

import template_method_pattern.abstractclass.Network;
import template_method_pattern.concreteclass.FaceBook;
import template_method_pattern.concreteclass.Twitter;

/**
 * @author xj
 * @version 1.0
 * @className Client
 * @since 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Network faceBook = new FaceBook("random", "random");
        Network twitter = new Twitter("random", "random");
        faceBook.push("haha");

        System.out.println("-----");
        twitter.push("xixi");
    }
}
