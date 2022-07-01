package factory.idcard;

import factory.framework.Product;

public class IdCard extends Product {

    private final String owner;
    private final int cardNo;

    public IdCard(String owner, int cardNo) {
        System.out.println(owner + "のカードを"+ cardNo + "で作ります");
        this.owner = owner;
        this.cardNo = cardNo;
    }

    @Override
    public void use() {
        System.out.println(this + "を使います。");
    }

    public String toString() {
        return "[IDCard:" + owner +  "(" + cardNo + ")" + "]";
    }

    public String getOwner() {
        return this.owner;
    }

    public int getCardNo() {
        return this.cardNo;
    }
}
