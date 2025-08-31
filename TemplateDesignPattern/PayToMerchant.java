public class PayToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Merchant's request validated");
    }

    @Override
    public void debit() {
        System.out.println("Merchant's amount debited");
    }

    @Override
    public void credit() {
        System.out.println("Merchant's amount credit");
    }

}
