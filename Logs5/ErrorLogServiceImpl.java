public class ErrorLogServiceImpl extends Logger{
    public void logMessage(String message) {
        super.logMessage(LOGTYPE.ERROR,message);
    }

}
