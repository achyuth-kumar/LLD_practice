import java.util.List;

public class AggregatorServiceImpl implements Aggregator{

    @Override
    public BookIteratorServiceImpl createAggregator(List<BookEntity> books) {
        return new BookIteratorServiceImpl(books);
    }
}
