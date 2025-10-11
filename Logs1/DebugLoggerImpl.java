public class DebugLoggerImpl implements Log {
    @Override
    public void LogMessage(LogType logtype) {
        System.out.println(logtype.DEBUG+" debug logs enabled");
    }
}
