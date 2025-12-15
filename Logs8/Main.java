public class Main {
    public static void main(String [] args) {
        LogServiceImpl logStrategy=new LogServiceImpl(new ErrorLogServiceImpl());
        logStrategy.log("Payment failed");

        logStrategy=new LogServiceImpl(new DebugLogServiceImpl());
        logStrategy.log("Transaction timeout");

        logStrategy=new LogServiceImpl(new InfoLogServiceImpl());
        logStrategy.log("Internal Server Error");

    }
}
