import java.util.List;

public class AggregatorServiceImpl implements Aggregator{
    @Override
    public BookIteratorServiceImpl createAggregator(List<Book> books) {
        return new BookIteratorServiceImpl(books);
    }
}
