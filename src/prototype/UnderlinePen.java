package prototype;

public class UnderlinePen implements Product {

    private final char underCh;

    public UnderlinePen(char underCh) {
        this.underCh = underCh;
    }

    public UnderlinePen(UnderlinePen prototype) {
        this.underCh = prototype.underCh;
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
        return new UnderlinePen(this);
    }
}
