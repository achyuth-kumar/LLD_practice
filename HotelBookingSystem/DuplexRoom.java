public class DuplexRoom implements RoomElement{
    public int roomId;

    public int getRoomId() {
        return this.roomId;
    }

    public DuplexRoom(int roomId) {
        this.roomId = roomId;
    }


    @Override
    public void roomType() {
        System.out.println("Duplex room selected");
    }
}
