public class Main {
    public static void main(String [] args) {
        int floor=5;
        User user1=new User(1,"Achyuth1");
        User user2=new User(2,"Achyuth2");
        User user3=new User(3,"Achyuth3");
        User user4=new User(4,"Achyuth4");
        User user5=new User(5,"Achyuth5");
        User user6=new User(6,"Achyuth6");
        User user7=new User(7,"Achyuth7");
        User user8=new User(8,"Achyuth8");
        User user9=new User(9,"Achyuth9");
        User user10=new User(10,"Achyuth10");
        ElevatorSystem elevatorSystem=new ElevatorSystemImpl(1);
        AdminOperator admin=new AdminOperator((ElevatorSystemImpl) elevatorSystem);
        admin.turnOn();
        if(elevatorSystem.getPowerStatus()==1) {
            for(int i=0;i<floor;i++) {
                if(i==0) {
                    System.out.println("Lift is in floor : "+i);
                    elevatorSystem.Upside();
                    elevatorSystem.OpenDoor();
                    elevatorSystem.Enter(user1);
                    elevatorSystem.Enter(user2);
                }
                if(i==2) {
                    System.out.println("Lift is in floor : "+i);
                    elevatorSystem.CloseDoor();
                    elevatorSystem.Enter(user6);
                    elevatorSystem.Enter(user7);
                }
            }
        }
        else {
            System.out.println("Power is Off");
        }
    }
}
