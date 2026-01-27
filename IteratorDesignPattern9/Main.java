import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<TextBook> books=new ArrayList<>();
        books.add(new TextBook(1, "H.C Verma"));
        books.add(new TextBook(2, "R.S Agarwal"));
        books.add(new TextBook(3, "Error less"));
        Aggregator aggregator=new AggregatorServiceImpl();
        BookIteratorServiceImpl iteratorService=aggregator.createAggregator(books);
        while(iteratorService.hasNext()) {
            TextBook textBook=iteratorService.next();
            System.out.println(textBook.getId()+" , "+ textBook.getName());
        }
    }
}
