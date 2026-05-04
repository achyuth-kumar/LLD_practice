public class Main {
    public static void main(String [] args) {
        RoboticFactory roboticFactory=new RoboticFactory();
        IRobot robot=roboticFactory.createRobot("HumanoidRobot");
        robot.display();

        robot=roboticFactory.createRobot("RoboticDog");
        robot.display();

    }
}
