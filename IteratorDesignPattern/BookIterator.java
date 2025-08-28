import java.util.List;

public class BookIterator implements Iteratorable{
    List<Book> bookList;
    int index=0;
    BookIterator(List<Book> bookList) {
        this.bookList=bookList;
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
