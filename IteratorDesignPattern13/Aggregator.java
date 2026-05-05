import java.util.List;

public interface Aggregator {
    public BookIteratorServiceimpl createAggregator(List<TextBook> bookList);
}
