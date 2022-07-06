package bridge;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomDisplay extends CountDisplay {
    public RandomDisplay(DisplayImpl display) {
        super(display);
    }

    public void randomDisplay(int times) {
        multiDisplay(new Random(times).nextInt());
    }
}
