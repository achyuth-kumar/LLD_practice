public class Main {
    public static void main(String args[]) {
        BookMyShow bookMyShow=new BookMyShow();
        bookMyShow.createUsers(1,"Achyuth","Achyuth@123");
        String movieName="KGF";
        Boolean movieAvailable = bookMyShow.checkMovieAvailability(movieName);
        if(movieAvailable) {
            System.out.println(movieName+" movie is available to book!!!");
            Integer price = bookMyShow.getMoviePrice("KGF");
            System.out.println("Movie price : " + price );
            Boolean paymentStatus = bookMyShow.Payment(1500); 
            if(paymentStatus) {
                System.out.println("payment success");
            }
            else {
                System.out.println("payment failure");
            }
        }
        else {
            System.out.println(movieName+" movie is not available to book!!!");
        }
    }
}