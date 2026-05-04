public class Main {
    public static void main(String [] args) {
        LogServiceImpl logger=new LogServiceImpl(new InfoLogServiceImpl());
        logger.log("Payment failed");

        logger=new LogServiceImpl(new DebugLogServiceImpl());
        logger.log("File not found");

        logger=new LogServiceImpl(new ErrorLogServiceImpl());
        logger.log("Transaction failed");

    }
}
