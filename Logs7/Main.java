public class Main {
    public static void main(String [] args) {
        LogServiceImpl logService=new LogServiceImpl(new ErrorLogServiceImpl());
        logService.log("Payment failed");

        logService=new LogServiceImpl(new DebugLogServiceImpl());
        logService.log("Transaction expired");

        logService=new LogServiceImpl(new InfoLogServiceImpl());
        logService.log("internal server issue");

    }
}
