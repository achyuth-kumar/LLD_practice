public class Main {
    public static void main(String [] args) {
        Customer customer1=new Customer(1,"Achyuth");
        RoomElement roomElement1=new SingleRoom(1);
        customer1.selectRoom(roomElement1);
        Ivisit roomService=new RoomSeviceImpl();
        roomService.visit(roomElement1);
        roomService.processBooking(customer1.getId(),1,4,3000,roomElement1);

        Customer customer2=new Customer(2,"Kumar");
        RoomElement roomElement2=new SingleRoom(1);
        customer1.selectRoom(roomElement2);
        roomService.visit(roomElement2);
        roomService.processBooking(customer2.getId(),5,6,4000,roomElement2);


    }
}
