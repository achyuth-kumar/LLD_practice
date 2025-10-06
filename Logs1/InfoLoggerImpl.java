public class InfoLoggerImpl implements Log{
    @Override
    public void LogMessage(LogType logType) {
        System.out.println(logType.INFO+" logs enabled");
    }
}
