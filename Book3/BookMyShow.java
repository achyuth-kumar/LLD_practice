import java.util.*;
public class BookMyShow implements State {
    public int userID,amount;
    public String userName,password,movieName;
    HashMap<String,Integer> price=new HashMap<String,Integer>();
    HashSet<Integer> user=new HashSet<>();
    @Override
    public void createUsers(int id, String userName, String password) {
        price.put("KGF",1000);
        price.put("DIA",2000);
        this.userID=id;
        this.userName=userName;
        this.password=password;
        if(user.contains(userID)) {
            System.out.println("users already exist in our DB");
        }
        else {
            System.out.println("User : "+ userName+" Got added");
        }
    }
    @Override 
    public Boolean checkMovieAvailability(String movieName) {
        this.movieName=movieName;
        if(price.containsKey(movieName)) {
            return true;
        }
        return false;
    }
    @Override
    public Integer getMoviePrice(String movieName) {
        this.movieName=movieName;
        return price.get(movieName);
    }
    @Override
    public Boolean Payment(int amount) {
        this.amount=amount;
        if(amount>=getMoviePrice(movieName)) {
            return true;
        }
        return false;
    }
}