package factory.idcard;

import factory.framework.Factory;
import factory.framework.Product;

public class IdCardFactory extends Factory {

    @Override
    protected Product createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + ":を登録しました。");
    }
}
