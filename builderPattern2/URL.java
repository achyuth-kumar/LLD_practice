public class URL {
    public String protocol;
    public String domain;
    public int port;
    public String pathParam;
    public String queryParam;
    URL(String protocol,int port,String domain,String pathParam,String queryParam) {
        this.protocol=protocol;
        this.domain=domain;
        this.port=port;
        this.pathParam=pathParam;
        this.queryParam=queryParam;
    }
}