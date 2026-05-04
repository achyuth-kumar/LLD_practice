public class RoboticFactory {
    public IRobot createRobot(String input) {
        if(input.equals("HumanoidRobot")) {
            return new HumanoidRobot();
        }
        else if(input.equals("RoboticDog")) {
            return new RoboticDog();
        }
        return null;
    }
}
