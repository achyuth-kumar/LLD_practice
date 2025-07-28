public class NonPolitician implements Book {
    @Override
    public void availeSlot(String date) {
        System.out.println("Slot is not available on : "+date);
    }
    @Override
    public void selectSlot() {
        System.out.println("Booking got cancelled!!!");
    }
}