public class Slot {
    Integer slotID;
    boolean filled;
    Pair<Integer,Integer> booking;

    public Slot(Integer slotID, boolean filled, Pair<Integer, Integer> booking) {
        this.slotID = slotID;
        this.filled = filled;
        this.booking = booking;
    }

    public Integer getSlotID() {
        return slotID;
    }

    public void setSlotID(Integer slotID) {
        this.slotID = slotID;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Pair<Integer, Integer> getBooking() {
        return booking;
    }

    public void setBooking(Pair<Integer, Integer> booking) {
        this.booking = booking;
    }


}

