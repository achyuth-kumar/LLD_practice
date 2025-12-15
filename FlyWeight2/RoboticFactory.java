public class RoboticFactory {
    public IRobot createRobotFactory(String input) {
        if(input.equals("human")) {
            return new HumanoidRobot();
        }
        else if(input.equals("dog")) {
            return new RoboticDog();
        }
        return null;
    }
}
