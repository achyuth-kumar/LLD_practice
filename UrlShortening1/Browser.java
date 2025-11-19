import java.util.HashMap;
import java.util.Map;

public class Browser {
    int shorten_code;
    HashMap<String,String> requestCache,responseCache;
    public Browser() {
        this.requestCache = new HashMap<>();
        this.responseCache = new HashMap<>();
        this.shorten_code=0;
    }
    public void processRequest(String url) {
        if(requestCache.containsKey(url)) {
            System.out.println("Fetching results from cache : "+responseCache.get(requestCache.get(url)));
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
    public String getShortenedURl(String url) {
        return requestCache.get(url);
    }
    public String getOriginalUrl(String shortenedUrl) {
        for(Map.Entry<String,String> entry : requestCache.entrySet()) {
            if(entry.getValue().equals(shortenedUrl)) {
                return entry.getKey();
            }
        }
        return "";
    }


    public void processResponse(String url,String shortenedUrl) {
        String result=fetchResults(url);
        responseCache.put(shortenedUrl,result);
        System.out.println(responseCache.get(shortenedUrl));
    }
    public String fetchResults(String url) {
        return "fetching results of : "+url+" : from google";
    }

}
