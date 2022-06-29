package Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        // 下記繰り返しはどちらもIteratorの実装を呼び出しているだけ
        // 従ってBookShelfの実装がどうなっていようと影響がない
        // 繰り返しに必要なのはIteratorのnext及びhasNextの実装のみ

        // 明示的にIteratorを使う方法
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }

        System.out.println();

        // 拡張for
        for(Book book: bookShelf) {
            System.out.println(book.getName());
        }

        System.out.println();

    }
}
