public class InfoLogServiceImpl extends Logger{
    public void logMessage(String message) {
        super.logMessage(LOGTYPE.INFO,message);
    }

}
