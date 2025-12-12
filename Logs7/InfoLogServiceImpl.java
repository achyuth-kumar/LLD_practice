public class InfoLogServiceImpl implements LogStrategy{
    @Override
    public void logMessage(String Message) {
        System.out.println(LogType.INFO+" : "+Message);
    }
}
