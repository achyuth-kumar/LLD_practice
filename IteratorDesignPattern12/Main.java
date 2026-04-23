import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<TextBook> bookList=List.of(new TextBook(1,"A"),new TextBook(2,"B"),new TextBook(3,"C"));
        Aggregator aggregator=new AggregatorServiceImpl();
        Iterator iterator=aggregator.createAggregator(bookList);
        while(iterator.hasNext()) {
            TextBook textBook=iterator.next();
            System.out.println(textBook.getId()+" , "+textBook.getName());
        }
    }
}
