public interface Ivisit {
    public void visit(RoomElement roomElement);
    public boolean checkAvailability(int customerId,Integer start,Integer end,int roomId);
    public void processBooking(int customerId,Integer start,Integer end,int amount,RoomElement roomElement);
    public boolean payment(int customerId,Integer start,Integer end,int amount,RoomElement roomElement);
}
