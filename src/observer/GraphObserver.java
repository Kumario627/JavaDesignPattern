package observer;

import java.util.stream.IntStream;

public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver:");
        int count = generator.getNumber();
        IntStream.range(0, count).forEach(i -> System.out.print("*"));
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
