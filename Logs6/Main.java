public class Main {
    public static void main(String [] args) {
        LogServiceImpl logService=new LogServiceImpl(new ErrorLogStrategyServiceImpl());
        logService.logMessage(" Payment failed");

        logService=new LogServiceImpl(new DebugLogStrategyServiceImpl());
        logService.logMessage(" Transaction expired");

        logService=new LogServiceImpl(new InfoLogStrategyServiceImpl());
        logService.logMessage(" Internal server issue");

    }
}
