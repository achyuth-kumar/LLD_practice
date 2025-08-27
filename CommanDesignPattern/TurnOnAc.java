public class TurnOnAc implements ICommand{
    AirConditioner ac;
    TurnOnAc(AirConditioner ac) {
        this.ac=ac;
    }
    @Override
    public void execute() {
        ac.turnOnAc();
    }
}
