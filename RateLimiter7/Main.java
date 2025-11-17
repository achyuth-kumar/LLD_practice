public class Main {
    public static void main(String [] args) {
        TokenBucketServiceImpl limiter=new TokenBucketServiceImpl(10,2);
        for(int i=0;i<15;i++) {
            if(limiter.TryConsumeBuckets()) {
                System.out.println("Accept : "+(i+1)+" : request : "+limiter.GetCurrentToken());
            }else{
                System.out.println("Reject : "+(i+1)+" : request :" + limiter.GetCurrentToken());
            }
        }
    }

}
