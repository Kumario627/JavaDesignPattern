package iterator;

import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ConcreteAggregate(Iterableの実装クラス)
 * Iteratorを作る必要がある
 */
public class BookShelf implements Iterable<Book> {

    private List<Book> books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new ArrayList<>(maxSize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    // Iterable<E>の内部のiteratorを拡張For文で自動で回す
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
