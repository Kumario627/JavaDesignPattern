package prototype;

public abstract class Product implements Cloneable {
    abstract void use(String s);

     Product createCopy() {
        Product product = null;

        try {
            product = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return product;
    }
}
