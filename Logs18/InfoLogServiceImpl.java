public class InfoLogServiceImpl implements LogStrategy{
    @Override
    public void LogMessage(String message) {
        System.out.println(LogType.INFO+" : "+message);
    }
}
