public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth" , new Browser());
        user.processRequest("www.wynk.com");
        String shortenedUrl= user.getShortenedUrl("www.wynk.com");
        System.out.println(shortenedUrl);
        System.out.println(user.getOriginalUrl(shortenedUrl));
        user.processRequest("www.spotify.com");
        user.processRequest("www.wynk.com");

    }
}
