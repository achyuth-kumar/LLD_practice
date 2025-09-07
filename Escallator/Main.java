public class Main {
    public static void main(String [] args) {
        ElevatorSystem elevatorSystem=new ElevatorSystem(true);
        User user=new User(elevatorSystem);
        UpSide upside=user.upSide();
        if(upside!=null) {
            System.out.println("Before stepout");
            upside.StepIn(0, 1);
            upside.StepIn(0, 2);
            upside.StepIn(1, 1);
            upside.StepIn(1, 2);
            upside.StepIn(2, 1);
            upside.StepIn(2, 2);
            upside.StepIn(2, 3);
            upside.displaySteps();
            System.out.println("After stepout");
            upside.StepOut(1);
            upside.displaySteps();
        }
        DownSide downside=user.downSide();
        if(downside!=null) {
            System.out.println("Before stepout");
            downside.StepIn(0,1);
            downside.StepIn(0,2);
            downside.StepIn(0,2);
            downside.StepIn(1,1);
            downside.StepIn(1,2);
            downside.displaySteps();
            System.out.println("After stepout");
            downside.StepOut(0);
            downside.displaySteps();
        }
    }
}
