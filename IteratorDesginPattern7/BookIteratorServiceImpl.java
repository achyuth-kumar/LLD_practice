import java.util.List;

public class BookIteratorServiceImpl implements Iterator{
    public Integer index;
    public List<Book> bookList;

    public BookIteratorServiceImpl(List<Book> bookList) {
        this.bookList = bookList;
        this.index = 0;
    }


    @Override
    public boolean hasNext() {
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
