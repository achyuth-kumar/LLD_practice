import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Book> books=new ArrayList<>();
        books.add(new Book(1,"Kumar"));
        books.add(new Book(2,"Achyuth"));
        books.add(new Book(3,"Ravi"));
        Aggregator aggregator=new AggregatorServiceImpl();
        BookIteratorServiceImpl iterator=aggregator.createAggregator(books);
        while(iterator.hasNext()) {
            Book book=iterator.next();
            System.out.println(book.getId()+" : "+book.getName());
        }
    }

}

