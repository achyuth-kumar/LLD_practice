public class ErrorLoggerImpl implements Log{
    @Override
    public void LogMessage(LogType logType) {
        System.out.println(logType.ERROR+" logs enabled");
    }
}
