public class Main {
    public static void main(String [] args) {
        Log logger=new Logger();
        Logger errorLogs=new ErrorLogServiceImpl();
        errorLogs.LogMessage(LogType.ERROR);

        Logger debugLogs=new DebugLogServiceImpl();
        debugLogs.LogMessage(LogType.DEBUG);

        Logger infoLogs=new InfoLogServiceImpl();
        infoLogs.LogMessage(LogType.INFO);

    }
}
