public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth");
        UrlShortnerService urlShortnerService=new UrlShortnerServiceImpl();
        urlShortnerService.processRequest("www.wynk.com");
        String shortenedUrl=urlShortnerService.getShortenedUrl("www.wynk.com");
        System.out.println(shortenedUrl);
        System.out.println(urlShortnerService.getOriginalUrl(shortenedUrl));
        System.out.println(urlShortnerService.fetchResult("www.wynk.com"));
        System.out.println();

        urlShortnerService.processRequest("www.jiosaavn.com");
        shortenedUrl=urlShortnerService.getShortenedUrl("www.jiosaavn.com");
        System.out.println(shortenedUrl);
        System.out.println(urlShortnerService.getOriginalUrl(shortenedUrl));
        System.out.println(urlShortnerService.fetchResult("www.jiosaavn.com"));
        System.out.println();

        urlShortnerService.processRequest("www.wynk.com");
        shortenedUrl=urlShortnerService.getShortenedUrl("www.wynk.com");
        System.out.println(shortenedUrl);
        System.out.println(urlShortnerService.getOriginalUrl(shortenedUrl));

    }
}
