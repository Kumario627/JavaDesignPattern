package abstractFactory.listFactory;

import abstractFactory.factory.Page;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html><head><title>");
        stringBuilder.append(title);
        stringBuilder.append("</title></head>\n");
        stringBuilder.append("<body>\n");
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
