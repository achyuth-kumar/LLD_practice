public class Main {
    public static void main(String [] args) {
        Machine machine=new Machine();
        Actions coin=machine.getAction("coin");
        coin.selectCoin();
        Actions item=machine.getAction("item");
        item.selectItem();
    }
}