package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

    private final String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for(Entry entry: directory) {
            size += entry.getSize();
        }

        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        directory.forEach(dir -> dir.printList(prefix + "/" + name));
    }

    public Entry add(Entry entry) {
        this.directory.add(entry);
        return this;
    }
}
