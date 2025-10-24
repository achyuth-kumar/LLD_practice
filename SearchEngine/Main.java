public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth",new Browser(new SearchEngineImpl()));
        user.search("");
        user.search("www.wynk.com");
        user.search("www.jiosaavn.com");
        user.search("www.wynk.com");
    }
}
