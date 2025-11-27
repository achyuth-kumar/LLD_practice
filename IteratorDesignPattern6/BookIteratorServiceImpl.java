import java.util.List;

public class BookIteratorServiceImpl implements Iterator{
    public int ind;
    public List<Book> books;
    BookIteratorServiceImpl(List<Book> books) {
        this.ind=0;
        this.books=books;
    }

    @Override
    public boolean hasNext() {
        return ind<books.size();
    }

    @Override
    public Book next() {
        if(this.hasNext()) {
            return books.get(ind++);
        }
        return null;
    }
}
