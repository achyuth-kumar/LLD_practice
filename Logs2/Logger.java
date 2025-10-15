public class Logger implements  Log{

    @Override
    public void LogMessage(LogType logType) {
        System.out.println(logType+" logs enabled");
    }
}
