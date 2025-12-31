public interface Browser {
    public void ProcessRequest(String url);
    public void ProcessResposne(String url,String ShortenedUrl);
    public String FetchResults(String url);
    public String getOriginalUrl(String ShortenedUrl);
    public String getShortenedUrl(String url);
}
