package composite;

public class Main {
    public static void main(String[] args) {
        System.out.println("making root entries...");
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");
        root.add(bin);
        root.add(tmp);
        root.add(usr);
        bin.add(new File("vi", 10000));
        bin.add(new File("latex", 20000));
        root.printList();
        System.out.println();
    }
}
