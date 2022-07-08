package Facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {

    }

    public static void makeWelcomePage(String mailAddress, String filename) {
        try {
            Properties mailProp = Database.getProperties("mailData");
            String username = mailProp.getProperty(mailAddress);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title(username + "'s web page");
            writer.paragraph("Welcome to " + username + "'s web page!");
            writer.paragraph("Nice to meet you!");
            writer.mailto(mailAddress, username);
            writer.close();
            System.out.println(filename + " is created for " + mailAddress + "(" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String filename)  {
        try {
            Properties mailProp = Database.getProperties("mailData");
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link page");
            mailProp.forEach((k,v) -> {
                try {
                    writer.link((String) k, (String) v);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
