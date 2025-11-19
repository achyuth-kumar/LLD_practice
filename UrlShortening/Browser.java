import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Browser {

    HashMap<String,String> requestCache,responseCache;
    int shorten_code;
    public Browser() {
        this.requestCache=new HashMap<>();
        this.responseCache = new HashMap<>();
        this.shorten_code=0;
    }
    public void processRequest(String url) {
        if(requestCache.containsKey(url)) {
            System.out.println("Fetch results from cache : "+responseCache.get(requestCache.get(url)));
            return ;
        }
        Random random=new Random();
        StringBuilder s=new StringBuilder();
        shorten_code=url.length();
        for(int i=0;i<4;i++) {
            s.append(random.nextInt(shorten_code));
        }
        requestCache.put(url,s.toString());
        processResponse(url,s.toString());
    }
    public String getShortenedURL(String url) {
        return requestCache.get(url);
    }
    public String getOriginalURL(String shortenedUrl) {
        for(Map.Entry<String,String> entry : requestCache.entrySet()) {
            if(entry.getValue().equals(shortenedUrl)) {
                return entry.getKey();
            }
        }
        return "";
    }

    public void processResponse(String url,String ShortenedURl) {
        String result=fetchResults(url);
        System.out.println(result);
        responseCache.put(ShortenedURl,result);
    }
    public String fetchResults(String url) {
        return "Fetching results of "+url+" from Google ";
    }


}
