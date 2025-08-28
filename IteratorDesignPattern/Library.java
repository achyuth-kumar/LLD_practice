import java.util.Iterator;
import java.util.List;

public class Library implements Aggregate{
    List<Book> booksList;
    Library(List<Book> books) {
        this.booksList=books;
    }
    @Override
    public BookIterator createIterator() {
        return new BookIterator(booksList);
    }
}

