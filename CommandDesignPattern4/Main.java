public class Main {
    public static void main(String [] args) {
        MyRemote remote=new MyRemote(new undoServiceImpl(new AirConditionerServiceImpl()));
        remote.invokeCommand();

        remote=new MyRemote(new redoServiceImpl(new AirConditionerServiceImpl()));
        remote.invokeCommand();


        remote=new MyRemote(new undoServiceImpl(new AirConditionerServiceImpl()));
        remote.invokeCommand();
    }
}
