import java.util.List;

public class BookIteratorServiceImpl implements Iterator{

    List<Book> bookList;
    Integer index;
    public BookIteratorServiceImpl(List<Book> bookList) {
        this.bookList = bookList;
        this.index=0;
    }

    @Override
    public Boolean hasNext() {
        return index<bookList.size();
    }

    @Override
    public Book next() {
        if(this.hasNext()) {
            return bookList.get(index++);
        }
        return null;
    }
}
