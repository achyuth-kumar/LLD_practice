public class Main {
    public static void main(String [] args) {
        RoboticFactory roboticFactory=new RoboticFactory();
        IRobot robot=roboticFactory.getRobot("RoboticDog");
        robot.Display();
        robot=roboticFactory.getRobot("HumanoidRobot");
        robot.Display();
        robot=roboticFactory.getRobot("HumanoidRobot1");
        robot.Display();
    }
}
