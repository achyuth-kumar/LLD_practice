import java.util.HashMap;

public class Browser {
    HashMap<String,String> Cache=new HashMap<>();
    SearchEngineImpl searchEngine;
    Browser(SearchEngineImpl searchEngine) {
        this.searchEngine=searchEngine;
    }
    public void ProcessRequest(String RequestUrl) {
        if(RequestUrl.isEmpty() || RequestUrl==null){
            System.out.println("Invalid url");
            return ;
        }
        if(Cache.containsKey(RequestUrl)) {
            System.out.println("Request-"+RequestUrl+",: "+Cache.get(RequestUrl));
            return ;
        }
        ProcessResponse(RequestUrl);
    }
    public void ProcessResponse(String RequestUrl) {
        String response = searchEngine.fetchResults(RequestUrl);
        Cache.put(RequestUrl,response);
        System.out.println("Request-"+RequestUrl+",: "+Cache.get(RequestUrl));
    }

}
