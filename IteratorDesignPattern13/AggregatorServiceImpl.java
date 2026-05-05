import java.util.List;

public class AggregatorServiceImpl implements Aggregator{
    @Override
    public BookIteratorServiceimpl createAggregator(List<TextBook> bookList) {
        return new BookIteratorServiceimpl(bookList);
    }
}
