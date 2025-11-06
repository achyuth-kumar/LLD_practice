public class Logger implements Log{
    @Override
    public void logMessage(LogType logType) {
        System.out.println(logType+" logs enabled");
    }

}
