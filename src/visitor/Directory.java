package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry implements Iterable<Entry> {

    private final String name;
    private List<Entry> directory = new ArrayList<>();
    private final SizeVisitor sizeVisitor = new SizeVisitor();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        this.accept(sizeVisitor);
        return sizeVisitor.getSize();
    }

    public Entry add(Entry entry) {
        this.directory.add(entry);
        return this;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public Iterator<Entry> iterator() {
        return directory.iterator();
    }
}
