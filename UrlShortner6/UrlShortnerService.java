public interface UrlShortnerService {
    public void processRequest(String url);
    public void processResponse(String url,String shortenedUrl);
    public String getOriginalUrl(String shortenerUrl);
    public String getShortenedUrl(String originalUrl);
}
