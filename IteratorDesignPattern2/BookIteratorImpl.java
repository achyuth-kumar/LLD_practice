import java.awt.event.HierarchyBoundsListener;
import java.util.ArrayList;
import java.util.List;

public class BookIteratorImpl implements Iterator {
    List<Book> books=new ArrayList<>();
    public int ind=0;
    BookIteratorImpl(List<Book> books) {
        this.books=books;
    }

    @Override
    public boolean hasNext() {
        return (ind<books.size());
    }

    @Override
    public void next() {
        if(this.hasNext()) {
            Book book=books.get(ind++);
            System.out.println(book.getId()+" : "+book.getName());
        }
    }

}
