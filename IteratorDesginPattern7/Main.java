import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Book> books=new ArrayList<>();
        books.add(new Book(1,"HC verma"));
        books.add(new Book(2,"Error Less"));
        books.add(new Book(3,"Jeevith"));
        Aggregator aggregator=new AggregatorServiceImpl();
        BookIteratorServiceImpl iteratorService=aggregator.createAggregator(books);
        while(iteratorService.hasNext()) {
            Book book=iteratorService.next();
            System.out.println(book.getId()+" : "+book.getName());
        }
    }
}

