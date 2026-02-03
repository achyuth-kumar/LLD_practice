public interface Browser {
    public void processRequest(String originalUrl);
    public void processResponse(String originalUrl,String shortenedUrl);
    public String fetchResults(String originalUrl);
    public String getOriginalUrl(String shortenedUrl);
    public String getShortenedUrl(String originalUrl);
}
