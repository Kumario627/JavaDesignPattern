package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class HtmlBuilder implements Builder {
    private String fileName;
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        fileName = title + ".html";
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("</html>\n");
        stringBuilder.append("<head><title>");
        stringBuilder.append(title);
        stringBuilder.append("</title></head>\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("<h1>");
        stringBuilder.append(title);
        stringBuilder.append("</h1>\n\n");
    }

    @Override
    public void makeString(String str) {
        stringBuilder.append("<p>");
        stringBuilder.append(str);
        stringBuilder.append("</p>\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        stringBuilder.append("<ul>");

        Arrays.stream(items).toList().forEach(item -> {
            stringBuilder.append("<li>");
            stringBuilder.append(item);
            stringBuilder.append("</li>\n");
        });

        stringBuilder.append("</ul>\n");
    }

    @Override
    public void close() {
        stringBuilder.append("</body>");
        stringBuilder.append("</html>");
        try {
            Writer writer = new FileWriter(fileName);
            writer.write(stringBuilder.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getHtmlResult() {
        return fileName;
    }

}
