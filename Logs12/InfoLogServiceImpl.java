public class InfoLogServiceImpl implements LogStrategy{
    @Override
    public void logMessage(String message) {
        System.out.println(LogLevel.INFO+" : "+message);
    }
}
