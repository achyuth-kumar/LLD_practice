import java.util.List;

public class BookIteratorServiceimpl implements Iterator{

    List<TextBook> bookList;
    Integer index;
    public BookIteratorServiceimpl(List<TextBook> bookList) {
        this.bookList = bookList;
        this.index=0;
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
