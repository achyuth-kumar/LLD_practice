public class Logger implements Log{


    @Override
    public void logMessage(LOGTYPE type,String message) {
        System.out.println(type+" : "+message);
    }
}
