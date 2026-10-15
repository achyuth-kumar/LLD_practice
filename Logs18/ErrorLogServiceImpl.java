public class ErrorLogServiceImpl implements LogStrategy{
    @Override
    public void LogMessage(String message) {
        System.out.println(LogType.ERROR+" : "+message);
    }
}
