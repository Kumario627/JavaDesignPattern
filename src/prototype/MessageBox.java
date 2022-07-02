package prototype;

public class MessageBox implements Product {

    private final char decorator;

    public MessageBox(char decorator) {
        this.decorator = decorator;
    }

    @Override
    public void use(String s) {
        outDecoratorLine(s);
        System.out.println(decorator + s + decorator);
        outDecoratorLine(s);
    }

    @Override
    public Product createCopy() {

        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }

    private void outDecoratorLine(String s) {
        //本文がdecoratorで囲まれているため+2する
        int decoratorLength = s.length() + 2;

        for(int i = 0; i < decoratorLength; i++) {
            System.out.print(decorator);
        }

        System.out.println();
    }
}
