import java.util.List;

public interface Aggregator {
    public BookIterator createAggregator(List<Book> books);
}