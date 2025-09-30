import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Book> books=new ArrayList<>();
        books.add(new Book(1,"HC verma"));
        books.add(new Book(2,"Error less"));
        books.add(new Book(3,"Jeevith"));
        Aggregator aggregator=new AggregatorImpl();
        BookIteratorImpl bookIterator=aggregator.createAggregator(books);
        while(bookIterator.hasNext()) {
            bookIterator.next();
        }
    }

}
