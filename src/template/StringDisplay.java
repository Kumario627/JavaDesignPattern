package template;

public class StringDisplay extends AbstractDisplay {
    private final String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
            System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        String decorate = "+";
        for (int i=0; i < string.length(); i++) {
            decorate += "-";
        }
        decorate += "+";

        System.out.println(decorate);
    }
}
