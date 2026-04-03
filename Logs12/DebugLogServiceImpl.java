public class DebugLogServiceImpl implements LogStrategy{
    @Override
    public void logMessage(String message) {
        System.out.println(LogLevel.DEBUG+" : "+message);
    }
}
