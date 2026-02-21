public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth");
        UrlShortnerService urlShortnerService=new UrlShortnerServiceImpl(new SearchEngine());
        urlShortnerService.processRequest("www.wynk.com");
        String shortenedUrl=urlShortnerService.getShortenedUrl("www.wynk.com");
        System.out.println(shortenedUrl);
        System.out.println(urlShortnerService.getOriginalUrl(shortenedUrl));
        System.out.println();

        urlShortnerService.processRequest("www.spotify.com");
        shortenedUrl=urlShortnerService.getShortenedUrl("www.spotify.com");
        System.out.println(shortenedUrl);
        System.out.println(urlShortnerService.getOriginalUrl(shortenedUrl));
        System.out.println();


        urlShortnerService.processRequest("www.wynk.com");
        shortenedUrl=urlShortnerService.getShortenedUrl("www.wynk.com");
        System.out.println(shortenedUrl);
        System.out.println(urlShortnerService.getOriginalUrl(shortenedUrl));

    }
}
