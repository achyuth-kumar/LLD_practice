import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<BookEntity> books=new ArrayList<>();
        books.add(new BookEntity(1,"HC verma"));
        books.add(new BookEntity(2,"Errorless"));
        books.add(new BookEntity(3,"Allen"));
        books.add(new BookEntity(4,"Narayana"));
        Aggregator aggregator=new AggregatorServiceImpl();
        BookIteratorServiceImpl bookIterator=aggregator.createAggregator(books);
        while(bookIterator.hasNext()) {
            BookEntity book=bookIterator.next();
            System.out.println(book.getId()+" : "+book.getName());
        }

    }

}
