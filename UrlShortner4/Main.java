public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth");
        Server server=new Server(1,"Tomcat");
        Browser browser=new BrowserServiceImpl();
        browser.processRequest("WWW.WYNK.com");
        String shortenedUrl=browser.getShortenedUrl("WWW.WYNK.com");
        System.out.println("Shortened URL : "+shortenedUrl);
        System.out.println("Original URL : "+browser.getOriginalUrl(shortenedUrl));
        System.out.println();

        browser.processRequest("WWW.SPOTIFY.com");
        shortenedUrl=browser.getShortenedUrl("WWW.SPOTIFY.com");
        System.out.println("Shortened URL : "+shortenedUrl);
        System.out.println("Original URL : "+browser.getOriginalUrl(shortenedUrl));
        System.out.println();


        browser.processRequest("WWW.WYNK.com");
        shortenedUrl=browser.getShortenedUrl("WWW.WYNK.com");
        System.out.println("Shortened URL : "+shortenedUrl);
        System.out.println("Original URL : "+browser.getOriginalUrl(shortenedUrl));
        System.out.println();

    }
}
