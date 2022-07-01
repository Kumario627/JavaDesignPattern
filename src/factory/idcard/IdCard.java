package factory.idcard;

import factory.framework.Product;

public class IdCard extends Product {

    private final String owner;

    public IdCard(String owner) {
        System.out.println(owner + "のカードを作ります");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "を使います。");
    }

    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return this.owner;
    }
}
