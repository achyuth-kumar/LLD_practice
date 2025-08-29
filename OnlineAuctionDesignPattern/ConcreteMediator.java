public class ConcreteMediator implements Mediator{
    Colleague colleague;
    ConcreteMediator(Colleague colleague) {
        this.colleague=colleague;
    }
    @Override
    public void sendMessage() {
        colleague.recieveNotification();
    }
}
