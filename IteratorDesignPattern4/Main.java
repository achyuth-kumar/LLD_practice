import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        Book book1=new Book(1,"H C verma");
        Book book2=new Book(2,"Error less");
        Book book3=new Book(3,"Prashant sharma");
        Book book4=new Book(4,"Sociology");

        List<Book> books=new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        Aggregator aggregator=new AggregatorImpl();
        BookIteratorImpl bookIterator=aggregator.createAggregator(books);
        while(bookIterator.hasNext()) {
            Book book=bookIterator.next();
            System.out.println(book.getId()+" : "+book.getName());
        }

    }
}
