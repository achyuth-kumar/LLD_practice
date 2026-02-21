import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class UrlShortnerServiceImpl implements UrlShortnerService{
    HashMap<String,String> requestCache=new HashMap<>();
    HashMap<String,String> responseCache=new HashMap<>();
    SearchEngine searchEngine;
    public UrlShortnerServiceImpl(SearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public void processRequest(String url) {
        if(requestCache.containsKey(url)) {
            System.out.println("Response from cache : "+responseCache.get(requestCache.get(url)));
            return ;
        }
        Integer shortened_code=4;
        StringBuilder shortenedUrl=new StringBuilder("tiny:/");
        Random random=new Random();
        for(int i=0;i<shortened_code;i++) {
            shortenedUrl.append(random.nextInt(shortened_code));
        }
        requestCache.put(url,shortenedUrl.toString());
        processResponse(url,shortenedUrl.toString());
    }

    @Override
    public void processResponse(String url,String shortenedUrl) {
        String results= searchEngine.fetchResults(url);
        responseCache.put(shortenedUrl,results);
    }


    @Override
    public String getOriginalUrl(String shortenerUrl) {
        for(Map.Entry<String,String> entry : requestCache.entrySet()) {
            if(entry.getValue().equals(shortenerUrl)) {
                return entry.getKey();
            }
        }
        return "-1";
    }

    @Override
    public String getShortenedUrl(String originalUrl) {
        return requestCache.get(originalUrl);
    }
}
