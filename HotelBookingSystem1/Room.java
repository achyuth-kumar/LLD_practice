public class Room {

    public Integer roomNo;
    public String name;

    public Room(Integer roomNo, String name) {
        this.roomNo = roomNo;
        this.name = name;
    }
    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        this.roomNo = roomNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
