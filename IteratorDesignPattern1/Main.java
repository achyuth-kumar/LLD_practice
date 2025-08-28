import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Book> books=new ArrayList<>();
        books.add(new Book(100,"A"));
        books.add(new Book(200,"B"));
        books.add(new Book(300,"C"));
        Aggregate agg=new Library(books);
        BookIterator iterator=agg.createIterator();
        while (iterator.hasNext()) {
            Book book=(Book)iterator.next();
            System.out.println(book.getPrice()+" : "+book.getName());
        }
    }
}
