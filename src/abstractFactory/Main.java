package abstractFactory;

import abstractFactory.factory.Factory;
import abstractFactory.factory.Link;
import abstractFactory.factory.Page;
import abstractFactory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Usage: java Main filename.html class.name.of.ConcreteFactory");
            System.out.println("Example 1 : java Main list.html abstractFactory.listFactory.ListFactory");
            System.out.println("Example 2 : java Main div.html abstractFactory.divFactory.DivFactory");
        }

        String fileName = args[0];
        String className = args[1];

        Factory factory = Factory.getFactory(className);

        Link blog1 = factory.createLink("Blog 1", "https://example.com/blog1");
        Link blog2 = factory.createLink("Blog 2", "https://example.com/blog2");
        Link blog3 = factory.createLink("Blog 3", "https://example.com/blog3");

        Tray blogTray = factory.createTray("Blog Site");
        blogTray.add(blog1);
        blogTray.add(blog2);
        blogTray.add(blog3);

        Link news1 = factory.createLink("News1", "https://example.com/news1");
        Link news2 = factory.createLink("News2", "https://example.com/news1");
        Link news3 = factory.createLink("News3", "https://example.com/news1");

        Tray newsTray = factory.createTray("News Site");
        newsTray.add(news1);
        newsTray.add(news2);
        newsTray.add(news3);

        Page page = factory.createPage("Blog and News", "Hiroshi Yuki");
        page.add(blogTray);
        page.add(newsTray);

        page.output(fileName);

    }
}
