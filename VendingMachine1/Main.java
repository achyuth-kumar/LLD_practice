public class Main {
    public static void main(String args[]) {
        State machine=new VendingMachine();
        machine.idleState();
        System.out.println("enter coin");
        machine.enterCoin(20);
        machine.dispenseItem(Item.SPRITE.getValue());
    }
}
