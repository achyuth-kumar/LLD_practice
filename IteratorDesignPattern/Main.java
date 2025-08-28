import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList=new ArrayList<>();
        bookList.add(new Book("A",100));
        bookList.add(new Book("B",200));
        bookList.add(new Book("C",300));
        Aggregate agg=new Library(bookList);
        BookIterator bookIterator=agg.createIterator();
        while(bookIterator.hasNext()) {
            Book book=bookIterator.next();
            System.out.println(book.getName()+" : "+book.getPrice());
        }
    }
}
