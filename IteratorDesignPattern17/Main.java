import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aggregator aggregator=new AggregatorServiceImpl();
        List<TextBook> bookList=List.of(new TextBook(1,"T1"),new TextBook(2,"T2"),new TextBook(3,"T3"));
        BookIteratorServiceImpl iteratorService=aggregator.createAggregator(bookList);
        while(iteratorService.hasNext()) {
            TextBook textBook=iteratorService.next();
            System.out.println(textBook.getId()+" , "+textBook.getName());
        }
    }
}
