public class Main {
    public static void main(String [] args) {
        Logger logger=new Logger(new infoLogServiceImpl());
        logger.logMessage("PAYMENT failed");

        logger=new Logger(new errorLogServiceImpl());
        logger.logMessage("File not found exception");

        logger=new Logger(new debugLogServiceImpl());
        logger.logMessage("Schema not exists");

    }
}
