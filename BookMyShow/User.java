public class User {
    public BookMyShow bookMyShow;
    User(BookMyShow bookMyShow) {
        this.bookMyShow=bookMyShow;
    }
    public void Book(String name,int amount) {
        boolean available = bookMyShow.checkAvailability(name);
        if (available == true) {
            bookMyShow.bookMovie(name,amount);
        } else {
            System.out.println("Movie not available");
        }
    }
}
