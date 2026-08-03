public class Main {
    public static void main(String[] args) {
         MyRemote myRemote=new MyRemote(new TurnOnServiceImpl(new AirConditionServiceImpl()));
         myRemote.presButton();
         myRemote.pressUndo();

         myRemote=new MyRemote(new TurnOffServiceImpl(new AirConditionServiceImpl()));
         myRemote.presButton();
         myRemote.pressUndo();

    }
}
