public class Main {
    public static void main(String [] args) {
        RoboticFactory roboticFactory=new RoboticFactory();
        Irobot robot=roboticFactory.createRobot("humanoid");
        robot.display();

        robot=roboticFactory.createRobot("roboticdog");
        robot.display();

    }
}
