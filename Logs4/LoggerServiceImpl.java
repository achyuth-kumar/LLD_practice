public class LoggerServiceImpl implements Log{

    @Override
    public void logMessage(LOGTYPE logtype) {
        System.out.println(logtype + " : logs enabled");
    }

}
