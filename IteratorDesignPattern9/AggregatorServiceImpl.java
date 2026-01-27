import java.util.List;

public class AggregatorServiceImpl implements Aggregator{
    @Override
    public BookIteratorServiceImpl createAggregator(List<TextBook> books) {
        return new BookIteratorServiceImpl(books);
    }
}
