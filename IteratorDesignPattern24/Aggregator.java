import java.awt.print.Book;
import java.util.List;

public interface Aggregator {
    public BookIteratorServiceImpl createAggregator(List<TextBook> bookList);
}
