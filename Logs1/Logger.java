public class Logger {

    public Log GetLogs(LogType logtype) {
        if(logtype==logtype.ERROR) {
            return (Log) new ErrorLoggerImpl();
        }
        else if(logtype==logtype.INFO) {
            return (Log) new InfoLoggerImpl();
        }
        else if(logtype==logtype.DEBUG) {
            return (Log) new DebugLoggerImpl();
        }
        return null;
    } 
}