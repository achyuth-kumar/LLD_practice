import java.util.HashMap;
import java.util.Map;

public class Browser {


    HashMap<String,String> requestCache,responseCache;
    int shorten_code;
    public Browser() {
        this.requestCache = new HashMap<>();
        this.responseCache = new HashMap<>();
        this.shorten_code=0;
    }
    public void processRequest(String url) {
        if(requestCache.containsKey(url))  {
            System.out.println("Fetched result from cache : "+responseCache.get(requestCache.get(url)));
            return ;
        }
        shorten_code=4;
        String shortenedUrl="";
        while(shorten_code!=0) {
            shortenedUrl+=url.charAt(shorten_code%62);
            shorten_code/=62;
        }
        requestCache.put(url,shortenedUrl);
        processResponse(url,shortenedUrl);
    }
    public void processResponse(String url,String shortenedUrl) {
        String result=fetchRefults(url);
        responseCache.put(shortenedUrl,result);
        System.out.println(result);
    }
    public String fetchRefults(String url) {
        return "Fetched results of : "+url+" : from Google";
    }

    public String getOriginalUrl(String shortenedUrl) {
        for(Map.Entry<String,String> entry : requestCache.entrySet()) {
            if(entry.getValue().equals(shortenedUrl)) {
                return entry.getKey();
            }
        }
        return "";
    }

    public String getShortenedUrl(String url) {
        return requestCache.get(url);
    }

}
