import java.util.List;

public class AggregatorImpl implements Aggregator {
   

    @Override
    public BookIterator createAggregator(List<Book> books) {
        return new BookIterator(books);   
    }
}
