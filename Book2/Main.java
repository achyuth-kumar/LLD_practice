public class Main {
    public static void main(String args[]) {
        Book book=new Book();
        Boolean bookConfirmation=book.getAvailability(1);
        if(bookConfirmation) {
            Payment payment=new Payment();
            payment.getAmount(80);
            payment.processPayment();
        }
        else {
            System.out.println("Slot not available");
        }
    }
}