public class Main {
    public static void main(String [] args) {
        Log log=new Logger();

        Logger errorLogService=new ErrorLogServiceImpl();
        errorLogService.logMessage(LogType.ERROR);

        Logger debugLogService=new DebugLogServiceImpl();
        debugLogService.logMessage(LogType.DEBUG);

        Logger infoLogService=new InfoLogServiceImpl();
        infoLogService.logMessage(LogType.INFO);

    }

}
