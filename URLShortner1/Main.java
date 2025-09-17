public class Main {
    public static void main(String [] args) {
        User user=new User(new Request(new Browser(new Response())));
        user.hitUrl("www.FlipkartGreatIndiaSale.com");
        user.hitUrl("www.FlipkartGreatIndiaSale.com");
        user.hitUrl("www.AmazonGreatIndiaSale.com");
        user.hitUrl("www.FlipkartGreatIndiaSale.com");

    }
}
