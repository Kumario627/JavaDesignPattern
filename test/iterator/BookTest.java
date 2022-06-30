package iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    void インスタンス作成時に本の名称が正しく設定されていること() {
        String bookName = "Java言語で学ぶデザインパターン入門";

        Book book = new Book(bookName);

        assertEquals(bookName, book.getName());
    }
}
