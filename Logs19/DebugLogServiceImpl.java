public class DebugLogServiceImpl implements LogStrategy{
    @Override
    public void logMessage(String logMessage) {
        System.out.println(LogType.DEBUG+" : "+logMessage);
    }
}
