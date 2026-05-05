import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TextBook> bookList=new ArrayList<>();
        bookList.add(new TextBook(1,"A"));
        bookList.add(new TextBook(2,"B"));
        bookList.add(new TextBook(3,"C"));
        Aggregator aggregator=new AggregatorServiceImpl();
        BookIteratorServiceimpl iterator=aggregator.createAggregator(bookList);
        while(iterator.hasNext()) {
            TextBook textBook=iterator.next();
            System.out.println(textBook.getId()+" , "+ textBook.getName());
        }
    }
}
