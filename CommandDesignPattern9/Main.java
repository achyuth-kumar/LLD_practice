public class Main {
    public static void main(String [] args) {
        MyRemote myRemote=new MyRemote(new TurnOnServiceImpl(new AirConditionerServiceImpl()));
        myRemote.pressButton();
        myRemote.pressUndo();
    }
}
