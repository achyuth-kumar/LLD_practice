import java.util.List;

public interface Aggregator {
    public BookIteratorServiceImpl createAggregator(List<BookEntity> books);
}
