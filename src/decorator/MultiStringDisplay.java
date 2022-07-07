package decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MultiStringDisplay extends Display {
    private List<String> lines = new ArrayList<>();
    private int maxLength;

    @Override
    public int getColumns() {
        return maxLength;
    }

    @Override
    public int getRows() {
        return lines.size();
    }

    @Override
    public String getRowText(int row) {
        String text = lines.get(row);

        if(text.length() == maxLength) {
            return text;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            IntStream.range(0, maxLength - text.length()).forEach(i -> stringBuilder.append(" "));
            return text + stringBuilder.toString();
        }
    }

    public void add(String str) {
        lines.add(str);
        maxLength = str.length() > maxLength ? str.length() : maxLength;
    }
}
