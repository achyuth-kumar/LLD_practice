public class Main {
    public static void main(String[] args) {
        RoboticFactory roboticFactory=new RoboticFactory();
        IRobot robot=roboticFactory.createRobot("human");
        robot.display();

        robot=roboticFactory.createRobot("dog");
        robot.display();

    }
}
