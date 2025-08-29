public class Main {
    public static void main(String [] args) {
        Colleague colleague=new Colleague2();
        ConcreteMediator mediator=new ConcreteMediator(colleague);
        mediator.sendMessage();
    }
}
