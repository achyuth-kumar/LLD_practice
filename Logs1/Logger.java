public class Logger implements Log {

    @Override
    public void LogMessage(LogType logtype) {
        System.out.println(logtype+" : logs enabled");
    } 
}