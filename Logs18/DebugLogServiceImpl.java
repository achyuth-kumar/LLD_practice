public class DebugLogServiceImpl implements LogStrategy{
    @Override
    public void LogMessage(String message) {
        System.out.println(LogType.DEBUG+" : "+message);
    }
}
