import java.util.List;

public class BookIteratorServiceImpl implements Iterator{

    List<TextBook> bookList;
    Integer index;
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
