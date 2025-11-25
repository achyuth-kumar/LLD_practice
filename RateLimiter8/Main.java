public class Main {
    public static void main(String [] args) {
        rateLimit limiter=new rateLimitServiceImpl(10,2);
        for(int i=0;i<15;i++) {
            if(limiter.tryConsumeToken()) {
                System.out.println("Request : "+(i+1)+" , Accepted : "+limiter.getCurrentToken());
            }
            else {
                System.out.println("Request : "+(i+1)+" , Rejected : "+limiter.getCurrentToken());
            }
        }

    }

}
