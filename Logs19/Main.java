public class Main {
    public static void main(String[] args) {
        LogServiceImpl logService=new LogServiceImpl(new ErrorLogServiceImpl());
        logService.log("File Not Found");

        logService=new LogServiceImpl(new DebugLogServiceImpl());
        logService.log("Transaction failure");

        logService=new LogServiceImpl(new InfoLogServiceImpl());
        logService.log("Please create table");

    }
}
