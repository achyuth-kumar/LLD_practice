import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TextBook> bookList=List.of(new TextBook(1,"A"),new TextBook(2,"B"),new TextBook(3,"C"));
        Aggregator aggregator=new AggregatorServiceImpl();
        BookIteratorServiceImpl iteratorService=aggregator.createAggregator(bookList);
        while (iteratorService.hasNext())  {
            TextBook textBook=iteratorService.next();
            System.out.println(textBook.getId()+" , "+textBook.getName());
        }

    }
}
