import java.util.List;

public class BookIteratorServiceImpl implements Iterator{
    Integer index=0;
    List<Books> bookList;
    public BookIteratorServiceImpl(List<Books> bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean hasNext() {
        return this.index<bookList.size();
    }

    @Override
    public Books next() {
        if(this.hasNext()){
            return bookList.get(index++);
        }
        return null;
    }
}
