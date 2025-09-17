import java.util.HashMap;

public class Response {
    public HashMap<String,String> responseCache=new HashMap<>();
    public String processResponse(String shortenedUrl) {
        if(responseCache.containsKey(shortenedUrl)) {
            return responseCache.get(shortenedUrl);
        }
        responseCache.put(shortenedUrl,"Response+for+"+shortenedUrl);
        return responseCache.get(shortenedUrl);
    }
}
