import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class UrlShortnerServiceImpl implements UrlShortnerService{

    HashMap<String,String> requestCache;
    HashMap<String,String> responseCache;
    public UrlShortnerServiceImpl() {
        this.requestCache = new HashMap<>();
        this.responseCache = new HashMap<>();
    }

    @Override
    public void processRequest(String url) {
        if(requestCache.containsKey(url)) {
            System.out.println("Results of Cache : "+responseCache.get(requestCache.get(url)));
            return ;
        }
        Integer shortened_code=4;
        StringBuilder shortnedUrl=new StringBuilder("bit:ly//");
        Random random=new Random();
        for(int i=0;i<shortened_code;i++) {
            shortnedUrl.append(random.nextInt(shortened_code));
        }
        requestCache.put(url,shortnedUrl.toString());
        processResponse(url,shortnedUrl.toString());
    }

    @Override
    public void processResponse(String url,String shortnedUrl) {
        String result=fetchResult(url);
        responseCache.put(shortnedUrl,result);
    }

    @Override
    public String fetchResult(String url) {
            return "Fetched results of : " + url + " : from Google";
    }

    @Override
    public String getOriginalUrl(String shortnedUrl) {
        for(Map.Entry<String,String> entry: requestCache.entrySet()) {
            if(entry.getValue().equals(shortnedUrl)) {
                return entry.getKey();
            }
        }
        return "";
    }

    @Override
    public String getShortenedUrl(String url) {
        return requestCache.get(url);
    }
}
