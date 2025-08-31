public class PayToFriend extends PaymentFlow{

    @Override
    public void validateRequest() {
        System.out.println("Friend's request validated");
    }

    @Override
    public void debit() {
        System.out.println("Friend's amount debitted");
    }

    @Override
    public void credit() {
        System.out.println("Friend's amount credited");
    }


}
