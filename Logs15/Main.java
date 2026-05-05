public class Main {
    public static void main(String[] args) {
        LogServiceImpl logger=new LogServiceImpl(new ErrorLogServiceImpl());
        logger.log("Transaction Failed");

        logger=new LogServiceImpl(new DebugLogServiceImpl());
        logger.log("Table Not found");

        logger=new LogServiceImpl(new InfoLogServiceImpl());
        logger.log("Key already exists");

    }
}

