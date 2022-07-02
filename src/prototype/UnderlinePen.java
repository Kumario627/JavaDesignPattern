package prototype;

public class UnderlinePen implements Product {

    private final char underCh;

    public UnderlinePen(char underCh) {
        this.underCh = underCh;
    }

    @Override
    public void use(String s) {
        int charLength = s.length();

        System.out.println(s);

        for(int i = 0; i < charLength; i++) {
            System.out.print(underCh);
        }

        System.out.println();
    }

    @Override
    public Product createCopy() {
        Product product = null;

        try {
            product = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return product;
    }
}
