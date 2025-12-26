public class DebugLogServiceImpl implements LogStrategy{
    @Override
    public void logMessage(String message) {
        System.out.println(LogType.DEBUG+" : "+message);
    }
}
