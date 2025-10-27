public class Main {
    public static void main(String[] args) {
        RateLimiter limiter=new RateLimiterImpl(10,2);
        for(int i=0;i<15;i++) {
            if(limiter.TryConcumeBucket()) {
                System.out.println("Request : "+(i+1)+", Accept : "+limiter.GetCurrentToken());
            }
            else {
                System.out.println("Request : "+(i+1)+", Reject : "+limiter.GetCurrentToken());
            }
        }
    }
}
