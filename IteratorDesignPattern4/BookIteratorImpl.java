import java.util.ArrayList;
import java.util.List;

public class BookIteratorImpl implements Iterator{
    List<Book> books=new ArrayList<>();
    int ind=0;
    BookIteratorImpl(List<Book> books) {
        this.books=books;
    }
    @Override
    public Boolean hasNext() {
        return ind<books.size();
    }

    @Override
    public Book next() {
        /*if(this.hasNext()) {
            Book book=books.get(ind);
            ind+=1;
            return book;
        }*/
        if(this.hasNext()) {
            return books.get(ind++);
        }
        return null;
    }
}
