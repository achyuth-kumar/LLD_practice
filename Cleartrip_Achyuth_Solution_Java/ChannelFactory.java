public class ChannelFactory {
    public static NotificationChannel get(ChannelType type) {
        if(type==ChannelType.EMAIL) {
            return new EmailNotification();
        }
        else if(type==ChannelType.SMS) {
            return new SMSNotification();
        }
        else if(type==ChannelType.PUSH) {
            return new PushNotification();
        }
        return null;
    }
}
