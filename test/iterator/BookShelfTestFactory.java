package iterator;

public class BookShelfTestFactory {

    private final String firstBookName = "一冊目";
    private final String secondBookName = "二冊目";

    private BookShelf bookShelf;

    public BookShelf getBookShelf() {
        return bookShelf;
    }

    BookShelfTestFactory() {



        bookShelf = new BookShelf(2);

        bookShelf.appendBook(new Book(firstBookName));
        bookShelf.appendBook(new Book(secondBookName));
    }
}
