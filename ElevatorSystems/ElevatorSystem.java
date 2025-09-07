public class ElevatorSystem {
    public boolean powerOn;
    ElevatorSystem(boolean powerOn) {
        this.powerOn=powerOn;
    }
    public UpSide upSide() {
        if(this.powerOn) {
            return new UpSide();
        }
        else {
            System.out.println("Power is off");
        }
        return null;
    }
    public DownSide downSide() {
        if(this.powerOn) {
            return new DownSide();
        }
        else {
            System.out.println("Power is off");
        }
        return null;
    }
}
