public class DebugLogServiceImpl extends Logger{
    public void logMessage(String message) {
        super.logMessage(LOGTYPE.DEBUG,message);
    }

}
