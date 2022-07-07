package decorator;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();

        Display d4 = new SideBorder(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(new StringDisplay("Hello, world"))
                                , '*'
                        )
                ), '/'
        );

        d4.show();

        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Hi!");
        md.add("Good morning.");
        md.add("Good night!");
        md.show();

        Display d5 = new SideBorder(md, '#');
        d5.show();

        Display d6 = new FullBorder(md);
        d6.show();

    }
}
