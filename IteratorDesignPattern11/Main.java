import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<TextBook> bookList=new ArrayList<>();
        bookList.add(new TextBook(1,"A"));
        bookList.add(new TextBook(2,"B"));
        bookList.add(new TextBook(3,"C"));
        bookList.add(new TextBook(4,"D"));
        Aggregator aggregator=new AggregatorServieImpl();
        BookIteratorServiceImpl iteratorService=aggregator.createAggregator(bookList);
        while(iteratorService.hasNext()) {
            TextBook textBook=iteratorService.next();
            System.out.println(textBook.getId()+" , "+textBook.getName());
        }
    }
}
