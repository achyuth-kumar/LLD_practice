public class Main {
    public static void main(String [] args) {
        ErrorLogServiceImpl errorLogService=new ErrorLogServiceImpl();
        errorLogService.logMessage("payment failed");

    }
}
