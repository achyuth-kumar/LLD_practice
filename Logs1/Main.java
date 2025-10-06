public class Main {
    public static void main(String [] args) {
        Logger errorLogger=new ErrorLoggerImpl();
        errorLogger.LogMessage(LogType.ERROR);
        Logger debugLogger=new DebugLoggerImpl();
        debugLogger.LogMessage(LogType.DEBUG);
        Logger infoLogger=new InfoLoggerImpl();
        infoLogger.LogMessage(LogType.INFO);
    
    }
}
