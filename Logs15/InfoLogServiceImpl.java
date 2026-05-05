public class InfoLogServiceImpl implements LogStrategy{
    @Override
    public void logMessage(String message) {
        System.out.println(LogType.INFO+" : "+message);
    }
}
