public class Main {
    public static void main(String[] args) {
        MyRemote myRemote=new MyRemote(new TurnOnServiceImpl(new AirConditionServiceImpl()));
        myRemote.pressButton();
        myRemote.pressUndo();

        myRemote=new MyRemote(new TurnOffServiceImpl(new AirConditionServiceImpl()));
        myRemote.pressButton();
        myRemote.pressUndo();

    }
}
