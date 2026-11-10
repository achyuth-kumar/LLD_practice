public class InfoLogServiceImpl implements LogStrategy{
    @Override
    public void logMessage(String logMessage) {
        System.out.println(LogType.INFO+" : "+logMessage);
    }
}
