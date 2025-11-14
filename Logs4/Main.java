public class Main {
    public static void main(String [] args) {
        Log log=new LoggerServiceImpl();

        log=new ErrorLogServiceImpl();
        log.logMessage(LOGTYPE.ERROR);

        log=new DebugLogServiceImpl();
        log.logMessage(LOGTYPE.DEBUG);

        log=new InfoLogServiceImpl();
        log.logMessage(LOGTYPE.INFO);

    }
}
