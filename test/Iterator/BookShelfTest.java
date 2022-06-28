package Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BookShelfTest {

    final String firstBookName = "一冊目";
    final String secondBookName = "二冊目";

    @Test
    void bookShelfが正常に利用できる() {

        BookShelf bookShelf = new BookShelf(2);
        // 領域を確保しただけなのでlengthは0
        assertEquals(0, bookShelf.getLength());

        bookShelf.appendBook(new Book(firstBookName));
        assertEquals(1, bookShelf.getLength());

        bookShelf.appendBook(new Book(secondBookName));
        assertEquals(2, bookShelf.getLength());

        for(int i =0; i < bookShelf.getLength(); i++) {
            assertEquals(firstBookName, bookShelf.getBookAt(i).getName());
        }
    }

    @Test
    void 確保したがappendしていない領域はnullが返却される() {
        BookShelf bookShelf = new BookShelf(2);

        bookShelf.appendBook(new Book(firstBookName));

        assertEquals(null, bookShelf.getBookAt(1));
    }
}
