public class MyRemote {

    public ICommand turnOnCommand,turnOffCommand;
    public boolean turn;
    public MyRemote() {
        turnOnCommand=new turnONServiceImpl(new AirConditionerServiceImpl());
        turnOffCommand=new turnOFFServiceImpl(new AirConditionerServiceImpl());
        this.turn=false;
    }

    public void pressButton() {
        if(!this.turn) {
            this.turn = true;
            turnOnCommand.execute();
        }
        else {
            System.out.println("AC is already turned ON");
        }
    }
    public void pressUndo() {
        if(this.turn) {
            turnOffCommand.execute();
        }
        else if(!this.turn) {
            turnOnCommand.execute();
        }
    }
}
