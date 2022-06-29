package Iterator;

import java.lang.Iterable;
import java.util.Iterator;

/**
 * ConcreteAggregate(Iterableの実装クラス)
 * Iteratorを作る必要がある
 */
public class BookShelf implements Iterable<Book> {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
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
