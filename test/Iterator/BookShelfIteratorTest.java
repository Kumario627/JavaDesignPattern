package Iterator;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookShelfIteratorTest {

    BookShelfTestFactory bookShelfTestFactory = new BookShelfTestFactory();

    @Test
    void hasNextが最終行まではtrue() {
        BookShelfIterator bookShelfIterator = new BookShelfIterator(bookShelfTestFactory.getBookShelf());

        for(int i=0; i <2; i++) {
            assertEquals(true, bookShelfIterator.hasNext());
            bookShelfIterator.next();
        }

        assertEquals(false, bookShelfIterator.hasNext());
        assertThrows(NoSuchElementException.class, () -> { bookShelfIterator.next(); });
    }

}
