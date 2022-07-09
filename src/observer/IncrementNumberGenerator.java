package observer;

import java.util.stream.IntStream;

public class IncrementNumberGenerator extends NumberGenerator {
    private final int startNum;
    private final int endNum;
    private final int incrementNum;
    private int number;

    public IncrementNumberGenerator(int startNum, int endNum, int incrementNum) {
        this.startNum = startNum;
        this.endNum = endNum;
        this.incrementNum = incrementNum;
    }


    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        int repeatRange = (endNum - startNum) / incrementNum;

        IntStream.range(0, repeatRange).forEach(i -> {
            number = startNum + (i * incrementNum);
            notifyObservers();
        });
    }
}
