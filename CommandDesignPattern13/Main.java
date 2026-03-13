public class Main {
    public static void main(String [] args) {
        MyRemote remote=new MyRemote(new TurnOnServiceImpl(new AirConditionServiceImpl()));
        remote.pressButton();
        remote.pressUndo();
    }
}
