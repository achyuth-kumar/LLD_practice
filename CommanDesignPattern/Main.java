public class Main {
    public static void main(String[] args) {
//        Remote remote=new Remote();
//        AirConditioner ac= remote.invokeCommand();
//        ICommand turnOn=new TurnOnAc(ac);
//        turnOn.execute();
//
//        ICommand turnOff=new TurnOffAc(ac);
//        turnOff.execute();
        AirConditioner ac=new AirConditioner();
        ICommand command=new TurnOnAc(ac);
        Remote remote=new Remote(command);
        remote.invokeCommand();

        command=new TurnOffAc(ac);
        remote=new Remote(command);
        remote.invokeCommand();
    }
}
