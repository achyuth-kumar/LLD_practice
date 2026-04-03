public class Main {
    public static void main(String [] args) {
        Logger logger=new Logger(new ErrorLogServiceImpl());
        logger.log("Payment failed");

        logger=new Logger(new DebugLogServiceImpl());
        logger.log("Null pointer exception");

        logger=new Logger(new InfoLogServiceImpl());
        logger.log("Database crashed");

    }
}
