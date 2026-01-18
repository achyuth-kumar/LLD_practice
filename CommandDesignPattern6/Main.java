public class Main {
    public static void main(String [] args) {
        MyRemote remote=new MyRemote();
        remote.pressButton(new turnOnCommandServiceImpl(new AirConditionerServiceImpl()));
        remote.pressUndo();

        remote.pressButton(new turnOnCommandServiceImpl(new AirConditionerServiceImpl()));
        remote.pressUndo();
    }
}
