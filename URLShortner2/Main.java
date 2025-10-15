public class Main {
    public static void main(String [] args) {
        MyUser user=new MyUser(new Browser());
        user.sendRequest("www.wynk.com");
        user.sendRequest("www.spotify.com");
        user.sendRequest("www.wynk.com");

    }
}
