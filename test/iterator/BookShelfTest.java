package iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BookShelfTest {

    final String firstBookName = "一冊目";
    final String secondBookName = "二冊目";
    final String thirdBookName = "三冊目";

    @Test
    void bookShelfが正常に利用できる() {

        BookShelf bookShelf = new BookShelf(2);
        // 領域を確保しただけなのでlengthは0
        assertEquals(0, bookShelf.getLength());

        bookShelf.appendBook(new Book(firstBookName));
        assertEquals(1, bookShelf.getLength());

        bookShelf.appendBook(new Book(secondBookName));
        assertEquals(2, bookShelf.getLength());

        assertEquals(firstBookName, bookShelf.getBookAt(0).getName());
        assertEquals(secondBookName, bookShelf.getBookAt(1).getName());

        // 最初に確保した領域以上にbookshelfへappendできる
        bookShelf.appendBook(new Book(thirdBookName));
        assertEquals(thirdBookName, bookShelf.getBookAt(2).getName());
    }

}
