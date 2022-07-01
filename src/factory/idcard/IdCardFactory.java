package factory.idcard;

import factory.framework.Factory;
import factory.framework.Product;

import java.util.HashMap;
import java.util.Map;

public class IdCardFactory extends Factory {

    Map<Integer, String> idCardInfo = new HashMap<>();
    int cardNo = 0;

    @Override
    protected Product createProduct(String owner) {
        return new IdCard(owner, cardNo++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + ":を登録しました。");
    }
}
