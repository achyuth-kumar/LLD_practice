public class Notification {
    public void sendSuccessMessage() {
        System.out.println("Message alert : Booking comfirmed");
    }
    public void sendFailureMessage() {
        System.out.println("Message alert : Booking cancelled");
    }
    public void sendSuccessMail() {
        System.out.println("Mail alert : Booking comfirmed");    
    }
    public void sendFailureMail() {
        System.out.println("Mail alert : Booking cancelled");    
    }
}