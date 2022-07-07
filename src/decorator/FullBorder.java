package decorator;

import java.util.stream.IntStream;

public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0 || row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        }

        return "|" + display.getRowText(row -1) + "|";
    }

    private String makeLine(char ch, int columns) {
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(0, columns).forEach(i -> stringBuilder.append(ch));

        return stringBuilder.toString();
    }
}
