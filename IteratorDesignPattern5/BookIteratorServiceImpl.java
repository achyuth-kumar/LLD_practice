import java.util.List;

public class BookIteratorServiceImpl implements Iterator{
    List<BookEntity> books;
    int ind;
    BookIteratorServiceImpl(List<BookEntity> books) {
        this.ind=0;
        this.books=books;
    }
    @Override
    public boolean hasNext() {
        return ind<books.size();
    }

    @Override
    public BookEntity next() {
        if(this.hasNext()) {
            return books.get(ind++);
        }
        return null;
    }
}
