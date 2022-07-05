package abstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

public class Tray extends Item {
    protected List<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}
