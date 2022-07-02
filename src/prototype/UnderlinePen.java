package prototype;

public class UnderlinePen extends Product {

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
}
