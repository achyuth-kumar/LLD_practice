public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void debit();
    public abstract void credit();
    public void sendMoney() {
        System.out.println("send money");
    }
}
