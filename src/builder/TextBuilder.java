package builder;

import java.util.Arrays;

public class TextBuilder implements Builder {

    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        stringBuilder.append("==========================\n");
        stringBuilder.append("『");
        stringBuilder.append(title);
        stringBuilder.append("』");
    }

    @Override
    public void makeString(String str) {
        stringBuilder.append("■");
        stringBuilder.append(str);
        stringBuilder.append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        Arrays.stream(items).toList().forEach(item -> {
            stringBuilder.append("　・");
            stringBuilder.append(item);
            stringBuilder.append("\n");
        });

        stringBuilder.append("\n");
    }

    @Override
    public void close() {
        stringBuilder.append("==========================\n");
    }

    public String getTextResult() {
        return stringBuilder.toString();
    }

}
