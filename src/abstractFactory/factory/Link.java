package abstractFactory.factory;

public class Link extends Item {

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }

    @Override
    public String makeHTML() {
        return null;
    }
}
