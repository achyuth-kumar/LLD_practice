public class ErrorLogServiceImpl implements LogStrategy{
    @Override
    public void logMessage(String Message) {
        System.out.println(LogType.ERROR+" : "+Message);
    }
}
