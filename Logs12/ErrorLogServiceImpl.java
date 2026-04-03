public class ErrorLogServiceImpl implements LogStrategy{
    @Override
    public void logMessage(String message) {
        System.out.println(LogLevel.ERROR+" : "+message);
    }
}
