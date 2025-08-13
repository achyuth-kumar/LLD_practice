public class Main {
    public static void main(String args[]) {
        State state=new VendingMachine();
        state.showMenu();
        state.insertCoin(5);
        state.dispenseItem("pepsi");
    }
}
