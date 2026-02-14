public interface UrlShortnerService {
    public void processRequest(String url);
    public void processResponse(String url,String shortnedUrl);
    public String fetchResult(String url);
    public String getOriginalUrl(String shortnedUrl);
    public String getShortenedUrl(String url);
}
