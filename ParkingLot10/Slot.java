public class Slot {
    Integer slotID;
    Boolean filled;
    Pair<Integer,Integer> currentBooking;

    public Slot(Integer slotID, Boolean filled, Pair<Integer, Integer> currentBooking) {
        this.slotID = slotID;
        this.filled = filled;
        this.currentBooking = currentBooking;
    }

    public Pair<Integer, Integer> getCurrentBooking() {
        return currentBooking;
    }

    public void setCurrentBooking(Pair<Integer, Integer> currentBooking) {
        this.currentBooking = currentBooking;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Integer getSlotID() {
        return slotID;
    }

    public void setSlotID(Integer slotID) {
        this.slotID = slotID;
    }



}
