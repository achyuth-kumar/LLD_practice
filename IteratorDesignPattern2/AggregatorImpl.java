import java.util.List;

public class AggregatorImpl implements Aggregator{

    @Override
    public BookIteratorImpl createAggregator(List<Book> books) {
        return new BookIteratorImpl(books);
    }
}
