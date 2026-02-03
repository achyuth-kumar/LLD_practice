import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BrowserServiceImpl implements Browser{

    HashMap<String,String> RequestCache,ResponseCache;
    public BrowserServiceImpl() {
        this.RequestCache = new HashMap<>();
        this.ResponseCache = new HashMap<>();
    }
    @Override
    public void processRequest(String originalUrl) {
        if(RequestCache.containsKey(originalUrl)) {
            
            System.out.println("Cache Results : "+ResponseCache.get(RequestCache.get(originalUrl)));
            return ;
        }
        int shortened_code=4;
        Random random=new Random();
        StringBuilder shortenedUrl= new StringBuilder("bitly:/");
        for(int i=0;i<shortened_code;i++) {
            shortenedUrl.append(random.nextInt(shortened_code));
        }
        RequestCache.put(originalUrl, shortenedUrl.toString());
        processResponse(originalUrl, shortenedUrl.toString());
    }

    @Override
    public void processResponse(String originalUrl,String shortenedUrl) {
        String results=fetchResults(originalUrl);
        ResponseCache.put(shortenedUrl,results);
    }

    @Override
    public String fetchResults(String originalUrl) {
        return "Fetched results of : "+originalUrl+" : from Google";
    }

    @Override
    public String getOriginalUrl(String shortenedUrl) {
        for(Map.Entry<String,String> entry : RequestCache.entrySet()) {
            if(entry.getValue().equals(shortenedUrl)) {
                return entry.getKey();
            }
        }
        return "";
    }

    @Override
    public String getShortenedUrl(String originalUrl) {
        return RequestCache.get(originalUrl);
    }
}
