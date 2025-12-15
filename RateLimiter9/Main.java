public class Main {
    public static void main(String [] args) {
        TokenBucket limiter=new TokenBucketServceImpl(10,2);
        for(int i=0;i<15;i++) {
            if(limiter.tryConsumeToken()) {
                System.out.println("Accept request : "+(i+1)+" , "+limiter.getCurrentToken());
            }
            else {
                System.out.println("Reject request : "+(i+1)+" , "+limiter.getCurrentToken());
            }
        }
    }
}
