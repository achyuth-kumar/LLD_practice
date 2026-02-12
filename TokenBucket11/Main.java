public class Main {
    public static void main(String [] args) {
        TokenBucket limiter=new TokenBucketServiceImpl(10L,2L);
        for(int i=0;i<15;i++) {
            if(limiter.tryConsumeToken()) {
                System.out.println("Accept : "+(i+1)+", token : "+ limiter.getCurrentToken());
            }
            else {
                System.out.println("Reject : "+(i+1)+", token : "+ limiter.getCurrentToken());
            }
        }
    }
}
