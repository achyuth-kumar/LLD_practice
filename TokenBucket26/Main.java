public class Main {
    public static void main(String[] args) {
        TokenBucket limiter=new TokenBucketServiceImpl(10L,2L);
        for(int i=0;i<15;i++) {
            if(limiter.tryConsumeToken()) {
                System.out.println("ACCEPT : "+(i+1)+" , "+limiter.getCurrentToken());
            }
            else {
                System.out.println("REJECT : "+(i+1)+" , "+limiter.getCurrentToken());
            }
        }
    }
}
