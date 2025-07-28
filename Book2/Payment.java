public class Payment extends Notification {
    Integer ticketPrice=100,amount;
    Notification notification=new Notification();
    public void getAmount(Integer amount) {
        this.amount=amount;
        System.out.println("Amount "+amount+" recieved from end user");
    }
    public void processPayment() {
        if(amount>=ticketPrice) {
            System.out.println("payment success");
            notification.sendSuccessMessage();
            notification.sendSuccessMail();
        }
        else {
            System.out.println("payment failure");
            notification.sendFailureMessage();
            notification.sendFailureMail();
        }
    }
}