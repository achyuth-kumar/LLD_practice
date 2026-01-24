public class RoboticFactory {
    public Irobot createRobot(String input) {
        if(input.equals("humanoid")) {
            return new HumanoidRobot();
        }
        else if(input.equals("roboticdog")) {
            return new RoboticDog();
        }
        return null;
    }

}
