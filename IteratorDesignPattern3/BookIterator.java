import java.util.List;

public class BookIterator implements Iterator{
    List<Book> books;
    public int ind=0;
    BookIterator(List<Book> books) {
        this.books=books;
    }
    @Override
    public boolean hasNext() {
        return ind<books.size();
    }

    @Override
    public Book next() {
        if(this.hasNext()) {
            Book book=books.get(ind);
            ind++;
            return book;
        }
        return null;
    }
    
}
