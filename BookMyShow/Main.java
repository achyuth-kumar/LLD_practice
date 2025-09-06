import java.awt.print.Book;

public class Main {
    public static void main(String [] args) {
        Movies movies=new Movies("KGF");
        Theatres theatres=new Theatres("KGF",200);
        BookMyShow bookMyShow=new BookMyShow(movies,theatres);
        User user=new User(bookMyShow);
        user.Book("KGF",1000);
    }
}
