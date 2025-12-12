public class DebugLogServiceImpl implements LogStrategy{
    @Override
    public void logMessage(String Message) {
        System.out.println(LogType.DEBUG+" : "+Message);
    }
}
