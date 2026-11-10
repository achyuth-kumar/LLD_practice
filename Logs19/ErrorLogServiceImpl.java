public class ErrorLogServiceImpl implements LogStrategy{
    @Override
    public void logMessage(String logMessage) {
        System.out.println(LogType.ERROR+" : "+logMessage);
    }
}
