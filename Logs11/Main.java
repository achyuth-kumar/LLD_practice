public class Main {
    public static void main(String [] args) {
        LogServiceImpl logService=new LogServiceImpl(new errorLogServiceImpl());
        logService.log("Null pointer exception");

        logService=new LogServiceImpl(new debugLogServiceImpl());
        logService.log("File not found exception");

        logService=new LogServiceImpl(new infoLogServiceImpl());
        logService.log("Arthematic exception");

    }
}
