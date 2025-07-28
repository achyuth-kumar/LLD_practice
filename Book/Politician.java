public class Politician implements Book {
    @Override
    public void availeSlot(String date) {
        System.out.println("Yes slot is available on : "+date);
    }
    @Override
    public void selectSlot() {
        System.out.println("Booking confirmed for politician!!!");
    }
}