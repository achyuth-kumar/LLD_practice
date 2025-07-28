public class Main {
    public static void main(String args[]) {
        Actions action = new Actions();
        Machine coin=action.getActions("coin");
        coin.selectCoin();
        Machine item=action.getActions("item");
        item.getItem();
        
    }
}