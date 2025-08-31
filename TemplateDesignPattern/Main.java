public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PayToFriend();
        paymentFlow.validateRequest();
        paymentFlow.debit();
        paymentFlow.credit();
    }
}
