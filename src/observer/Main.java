package observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new IncrementNumberGenerator(10, 50, 5);
        Observer digitObserver = new DigitObserver();
        Observer GraphObserver = new GraphObserver();
        generator.addObserver(digitObserver);
        generator.addObserver(GraphObserver);
        generator.execute();
    }
}
