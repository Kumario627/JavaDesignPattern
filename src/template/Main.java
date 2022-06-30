package template;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay chDisplay = new CharDisplay('H');
        chDisplay.display();

        System.out.println();

        AbstractDisplay stringDisplay = new StringDisplay("Hello, world.");
        stringDisplay.display();

    }
}
