import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aggregator aggregator=new AggregatorServiceImpl();
        List<TextBook> bookList= List.of(new TextBook(1,"A"),new TextBook(2,"B"),new TextBook(3,"C"));
        BookIteratorServiceImpl iterator=aggregator.createAggregator(bookList);
        while (iterator.hasNext()) {
            TextBook textBook=iterator.next();
            System.out.println(textBook.getId()+" , "+ textBook.getName());
        }
    }
}
