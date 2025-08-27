public class AirConditioner {
    boolean turnOnOff;
    public void turnOnAc() {
        this.turnOnOff=true;
        System.out.println("AC got turned ON");
    }
    public void turnOffAc() {
        this.turnOnOff=false;
        System.out.println("AC got turned OFF");
    }
}
