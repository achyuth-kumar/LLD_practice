import java.awt.print.Book;
import java.util.List;

public interface Aggregator {
    public Iterator createAggregator(List<Books> bookList);
}
