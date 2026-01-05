public class Main {
    public static void main(String [] args) {
        LogServiceImpl logService=new LogServiceImpl(new ErrorLogServiceImpl());
        logService.log("Transaction failed");

        logService=new LogServiceImpl(new DebugLogServiceImpl());
        logService.log("Table not found");

        logService=new LogServiceImpl(new InfoLogServiceImpl());
        logService.log("500 internal server error");

    }
}
