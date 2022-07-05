package abstractFactory.divFactory;

import abstractFactory.factory.Page;

public class DivPage extends Page {

    public DivPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html><head><title>");
        stringBuilder.append(title);
        stringBuilder.append("</title><style>\n");
        stringBuilder.append("div.TRAY { padding:0.5em; margin-left:5em; border:1px solid black; }\n");
        stringBuilder.append("div.LINK { padding:0.5em; background-color:lightgray; }\n");
        stringBuilder.append("</style></head><body>\n");
        stringBuilder.append("<h1>\n");
        stringBuilder.append(title);
        stringBuilder.append("</h1>\n");
        stringBuilder.append("<ul>\n");
        content.forEach(item -> {
            stringBuilder.append(item.makeHTML());
        });
        stringBuilder.append("</ul>\n");
        stringBuilder.append("<hr><address>");
        stringBuilder.append(author);
        stringBuilder.append("</address>\n");
        stringBuilder.append("</body></html>\n");

        return stringBuilder.toString();
    }
}
