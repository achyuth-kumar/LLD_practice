public class Main {
    public static void main(String [] args) {
        Sender sender=new Sender();
        Reciever reciever=new Reciever();
        sender.sendMessage(1,"Achyuth");
        reciever.recieveMessage(1);
        sender.sendMessage(1,"Kumar");
        reciever.recieveMessage(1);
        sender.sendMessage(2,"Suma");
        reciever.recieveMessage(2);
        sender.sendMessage(2,"Saraswathi");
        reciever.recieveMessage(2);
        Message.displayAllMessage();
    }
}
