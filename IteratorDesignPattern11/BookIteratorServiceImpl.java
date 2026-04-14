import java.util.List;

public class BookIteratorServiceImpl implements Iterator{
    Integer index=0;
    List<TextBook> bookList;
    public BookIteratorServiceImpl(List<TextBook> bookList) {
        this.index=0;
        this.bookList = bookList;
    }

    @Override
    public boolean hasNext() {
        return index<bookList.size();
    }

    @Override
    public TextBook next() {
        if(this.hasNext()) {
            return bookList.get(index++);
        }
        return null;
    }
}
