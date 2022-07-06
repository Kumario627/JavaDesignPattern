package bridge;

import java.util.stream.IntStream;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl display) {
        super(display);
    }

    public void multiDisplay(int times) {
        open();
        IntStream.range(0, times).forEach(i -> print());
        close();
    }
}
