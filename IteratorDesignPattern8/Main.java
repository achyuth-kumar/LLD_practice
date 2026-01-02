import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Book> bookList=new ArrayList<>();
        bookList.add(new Book(1,"R.S Aggarwal"));
        bookList.add(new Book(2,"HC Verma"));
        bookList.add(new Book(3,"ErrorLess"));
        Aggregator aggregator=new AggregatorServiceImpl();
        Iterator iterator=aggregator.createAggregator(bookList);
        while(iterator.hasNext()) {
            Book book=iterator.next();
            System.out.println(book.getId()+" , "+book.getName());
        }
    }
}
