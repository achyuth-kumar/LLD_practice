public class RoboticFactory {
    public IRobot getRobot(String input) {
        if(input.equals("RoboticDog")) {
            return new RoboticDog();
        }
        else if(input.equals("HumanoidRobot")) {
            return new HumanoidRobot();
        }
        return new NullObject();
    }
}
