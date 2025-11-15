public class SingleRoom implements  RoomElement{
    public int roomId;

    public SingleRoom(int roomId) {
        this.roomId = roomId;
    }

    public int getRoomId() {
        return this.roomId;
    }

    @Override
    public void roomType() {
        System.out.println("Single Room selected");
    }
}
