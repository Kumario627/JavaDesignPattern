package flyweight;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BigString {
    private BigChar[] bigChars;

    public BigString (String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigChars = new BigChar[string.length()];
        IntStream.range(0, bigChars.length).forEach(i -> bigChars[i] = factory.getBigChar(string.charAt(i)));
    }

    public void print() {
        Arrays.stream(bigChars).toList().forEach(bigChar -> bigChar.print());
    }
}
