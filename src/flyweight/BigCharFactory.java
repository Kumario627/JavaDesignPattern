package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    private Map<String, BigChar> pool = new HashMap<>();
    private static BigCharFactory bigCharFactory = new BigCharFactory();

    private BigCharFactory() {}

    public static BigCharFactory getInstance() {
        return bigCharFactory;
    }

    public synchronized BigChar getBigChar(char charName) {
        String charString = String.valueOf(charName);
        BigChar bigChar = pool.get(charString);
        if(bigChar == null) {
            bigChar = new BigChar(charName);
            pool.put(charString, bigChar);
        }

        return bigChar;
    }

}
