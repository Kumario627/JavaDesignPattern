package flyweight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
    private final char charName;
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;

        try {
            String filename = "big" + charName + ".txt";
            StringBuilder stringBuilder = new StringBuilder();
            Files.readAllLines(Path.of(filename)).forEach(line -> {
                stringBuilder.append(line);
                stringBuilder.append("\n");
            });
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println(fontData);
    }
}
