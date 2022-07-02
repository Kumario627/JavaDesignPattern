package prototype;

public class MessageBox implements Product {

    private final char decorator;

    public MessageBox(char decorator) {
        this.decorator = decorator;
    }

    public MessageBox(MessageBox prototype) {
        this.decorator = prototype.decorator;
    }

    @Override
    public void use(String s) {
        outDecoratorLine(s);
        System.out.println(decorator + s + decorator);
        outDecoratorLine(s);
    }

    @Override
    public Product createCopy() {
        return new MessageBox(this);
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
