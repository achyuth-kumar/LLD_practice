public class Main {
    public static void main(String [] args) {
        Logger logger=new Logger();
        Log errorLogger=logger.GetLogs(LogType.ERROR);
        errorLogger.LogMessage(LogType.ERROR);

        Log debugLogger=logger.GetLogs(LogType.DEBUG);
        debugLogger.LogMessage(LogType.DEBUG);

        Log infoLogger=logger.GetLogs(LogType.INFO);
        infoLogger.LogMessage(LogType.INFO);
    
    }
}
