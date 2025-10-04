import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        Aggregator aggregator=new AggregatorImpl();
        List<Book> books=new ArrayList<>();
        books.add(new Book(1, "Achyuth"));
        books.add(new Book(2, "Kumar"));
        books.add(new Book(3, "Ravi"));
        books.add(new Book(4, "Raj"));
        BookIterator bookIterator=aggregator.createAggregator(books);
        while(bookIterator.hasNext()) {
            Book book=bookIterator.next();
            System.out.println(book.getId()+" : "+book.getName());
        }
    }
}
