public class Main {
    public static void main(String [] args) {
        RateLimiter rateLimiter=new RateLimiterImpl(10,2);
        for(int i=0;i<15;i++) {
            if(rateLimiter.TryConsumeBucket()) {
                System.out.println("Request : "+(i+1)+" :Allowed token "+rateLimiter.GetCurrentTockens());
            }
            else {
                System.out.println("Request : "+(i+1)+" :Declined token "+rateLimiter.GetCurrentTockens());
            }
        }

    }
}
