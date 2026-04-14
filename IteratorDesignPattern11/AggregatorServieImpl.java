import java.util.List;

public class AggregatorServieImpl implements Aggregator{
    @Override
    public BookIteratorServiceImpl createAggregator(List<TextBook> bookList) {
            return new BookIteratorServiceImpl(bookList);
    }
}
