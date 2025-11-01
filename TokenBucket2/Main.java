public class Main {
    public static void main(String[] args) {
        TokenBucket limiter=new TokenBucket(10,2);
        for(int i=0;i<15;i++) {
            if(limiter.TryConsumeBucket()) {
                System.out.println("Request : "+(i+1)+", Accept : "+limiter.GetCurrentToken());
            }
            else {
                System.out.println("Request : "+(i+1)+", Reject : "+limiter.GetCurrentToken());
            }
        }
    }
}
