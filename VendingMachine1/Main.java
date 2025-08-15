import java.util.Random;

public class Main {
    public static void main(String args[]) {
        int n=10;
        Random random=new Random();
        System.out.println(random.nextInt(n));
        /*State machine=new VendingMachine();
        machine.idleState();
        System.out.println("enter coin");
        machine.enterCoin(20);
        machine.dispenseItem(Item.SPRITE.getValue());*/
    }
}
