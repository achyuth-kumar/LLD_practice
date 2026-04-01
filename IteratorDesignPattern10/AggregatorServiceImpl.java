import java.awt.print.Book;
import java.util.List;

public class AggregatorServiceImpl implements Aggregator{
    @Override
    public Iterator createAggregator(List<Books> bookList) {
        return new BookIteratorServiceImpl(bookList);
    }

}
