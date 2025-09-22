public class Logger implements  Log {

    @Override
    public void logMessage(LogType type) {
        System.out.println(type+" logs enabled");
    }
}
