import java.util.List;

public interface Aggregator {
    public BookIteratorImpl createAggregator(List<Book> books);
}
