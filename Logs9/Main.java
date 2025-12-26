public class Main {
    public static void main(String [] args) {
        LogServiceImpl logService=new LogServiceImpl(new ErrorLogServiceImpl());
        logService.log("Payment failed");

        logService=new LogServiceImpl(new InfoLogServiceImpl());
        logService.log("Coupon Expired");

        logService=new LogServiceImpl(new DebugLogServiceImpl());
        logService.log("Table not found");

    }
}
