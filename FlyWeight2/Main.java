public class Main {
    public static void main(String [] args) {
        RoboticFactory roboticFactory=new RoboticFactory();
        IRobot robot=roboticFactory.createRobotFactory("human");
        robot.display();

        robot=roboticFactory.createRobotFactory("dog");
        robot.display();

    }
}
