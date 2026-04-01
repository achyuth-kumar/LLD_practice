import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Books> bookList=new ArrayList<>();
        bookList.add(new Books(1,"A"));
        bookList.add(new Books(2,"B"));
        bookList.add(new Books(3,"C"));
        Aggregator aggregator=new AggregatorServiceImpl();
        Iterator iterator=aggregator.createAggregator(bookList);
        while(iterator.hasNext()) {
            Books book=iterator.next();
            System.out.println(book.getId()+" , "+book.getTitle());
        }
    }
}

