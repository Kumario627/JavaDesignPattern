package factory;

import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IdCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IdCardFactory();

        Product idCard1 = factory.create("takashi");
        Product idCard2 = factory.create("hanako");

        idCard1.use();
        idCard2.use();

    }
}
