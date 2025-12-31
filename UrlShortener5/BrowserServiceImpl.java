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
    public void ProcessRequest(String url) {
        if(RequestCache.containsKey(url)) {
            System.out.println("Cache results : "+ResponseCache.get(RequestCache.get(url)));
            return ;
        }
        Integer Shortened_Code=4;
        Random random=new Random();
        String ShortenedUrl=new String("bitly://");
        for(int i=0;i<Shortened_Code;i++) {
            ShortenedUrl+=random.nextInt(Shortened_Code);
        }
        RequestCache.put(url,ShortenedUrl);
        System.out.println(url+" : Request Processed");
        ProcessResposne(url,ShortenedUrl);
    }

    @Override
    public void ProcessResposne(String url, String ShortenedUrl) {
        String results=FetchResults(url);
        ResponseCache.put(ShortenedUrl,results);
        System.out.println("Response : "+ results);
        return ;
    }

    @Override
    public String FetchResults(String url) {
        return "Fetched results of : "+url+" , from Google";
    }

    @Override
    public String getOriginalUrl(String ShortenedUrl) {
        for(Map.Entry<String,String> entry :RequestCache.entrySet()) {
            if(entry.getValue().equals(ShortenedUrl)) {
                return entry.getKey();
            }
        }
        return "-1";
    }

    @Override
    public String getShortenedUrl(String url) {
        return RequestCache.get(url);
    }
}
