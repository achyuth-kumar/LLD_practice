public class Main {
    public static void main(String [] args) {
        TokenServiceImpl limiter=new TokenServiceImpl(10L,2L);
        for(int i=0;i<15;i++) {
            if(limiter.TryConsumeBucket()) {
                System.out.println("Request : "+(i+1)+" , Accept : "+limiter.GetCurrentToken());
            }
            else {
                System.out.println("Request : "+(i+1)+" , Reject : "+limiter.GetCurrentToken());
            }
        }
    }
}
