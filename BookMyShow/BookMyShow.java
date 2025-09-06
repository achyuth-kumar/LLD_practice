import java.util.HashMap;

public class BookMyShow {
    Movies movies;
    Theatres theatres;
    BookMyShow(Movies movies,Theatres theatres) {
        this.movies=movies;
        this.theatres=theatres;
    }
    public boolean checkAvailability(String name) {
        if(movies.getMovieAvailability(name) && theatres.getAvailabilityInTheatres(name)) {
            return true;
        }
        return false;
    }
    public void bookMovie(String name,int amount) {
        if(checkAvailability(name)) {
            makePayment(name,amount);
        }
    }
    public void makePayment(String name,int amount) {
        String status;
        if(amount< theatres.getPrice(name)) {
            status="not_done";
            System.out.println("Insuffient amount");
        }
        else {
            status="done";
            int change=Math.abs(amount- theatres.getPrice(name));
            if(change>0) {
                System.out.println("please take the change : "+change);
            }
        }
        System.out.println("Confirmation status : "+getBookingConfirmation(status));
    }
    public String getBookingConfirmation(String status) {
        if(status.equals("not_done")) {
            return "not yet confirmed";
        }
        else {
            return "confirmed";
        }
    }
}
