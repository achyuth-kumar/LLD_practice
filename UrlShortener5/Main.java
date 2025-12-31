public class Main {
    public static void main(String [] args) {
        Browser browser=new BrowserServiceImpl();
        String url="www.wynk.com";
        browser.ProcessRequest(url);
        String ShortenedUrl=browser.getShortenedUrl(url);
        System.out.println(browser.getOriginalUrl(ShortenedUrl)+" , "+ShortenedUrl);
        System.out.println();


        url="www.spotify.com";
        browser.ProcessRequest(url);
        ShortenedUrl=browser.getShortenedUrl(url);
        System.out.println(browser.getOriginalUrl(ShortenedUrl)+" , "+ShortenedUrl);
        System.out.println();

        url="www.wynk.com";
        browser.ProcessRequest(url);
        ShortenedUrl=browser.getShortenedUrl(url);
        System.out.println(browser.getOriginalUrl(ShortenedUrl)+" , "+ShortenedUrl);
        System.out.println();
    }
}
