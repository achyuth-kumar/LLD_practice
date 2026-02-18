public class Main {
    public static void main(String [] args) {
        TokenBucket rateLimiter=new TokenBucketServiceImpl(10L,2L);
        for(int i=0;i<15;i++) {
            if(rateLimiter.tryConsumeToken()) {
                System.out.println("Accept : "+(i+1)+" , token "+rateLimiter.getCurrentToken());
            }
            else {
                System.out.println("Reject : "+(i+1)+" , token "+rateLimiter.getCurrentToken());
            }
        }
    }
}
