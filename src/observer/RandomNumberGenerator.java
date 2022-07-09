package observer;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        IntStream.range(0, 20).forEach(i -> {
            number = random.nextInt(50);
            notifyObservers();
        });
    }

}
