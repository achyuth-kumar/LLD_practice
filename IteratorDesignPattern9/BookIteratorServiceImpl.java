import java.util.ArrayList;
import java.util.List;

public class BookIteratorServiceImpl implements  Iterator{
    List<TextBook> books=new ArrayList<>();
    Integer index;
    public BookIteratorServiceImpl(List<TextBook> bookList) {
        this.index=0;
        this.books = bookList;
    }

    @Override
    public boolean hasNext() {
        return index<books.size();
    }

    @Override
    public TextBook next() {
        if(this.hasNext()) {
            return books.get(index++);
        }
        return null;
    }
}
