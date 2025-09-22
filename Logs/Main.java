public class Main {
    public static void main(String [] args) {
        ErrorLog errorLog=new ErrorLog();
        errorLog.logMessage();
        DebugLog debugLog=new DebugLog();
        debugLog.logMessage();
        InfoLog infoLog=new InfoLog();
        infoLog.logMessage();
    }

}
