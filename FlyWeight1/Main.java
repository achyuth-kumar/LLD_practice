public class Main {
    public static void main(String [] args) {
        RoboticFactory roboticFactory=new RoboticFactory();
        Irobot robot=roboticFactory.createRobot("RoboticDog");
        robot.display();
    }
}
