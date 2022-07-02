package prototype;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('_');
        MessageBox messageBox = new MessageBox('*');
        MessageBox messageBox1 = new MessageBox('/');

        manager.register("strong message", underlinePen);
        manager.register("warning box", messageBox);
        manager.register("slash box", messageBox1);

        Product underlineProduct = manager.create("strong message");
        underlineProduct.use("Hello world.");

        Product messageBoxProduct = manager.create("warning box");
        messageBoxProduct.use("Hello world.");

        Product slashBoxProduct = manager.create("slash box");
        slashBoxProduct.use("Hello world.");
    }
}
