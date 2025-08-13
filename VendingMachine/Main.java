public class Main {
    public static void main(String args[]) {
        State state=new VendingMachine();
        state.showMenu();
        state.insertCoin(1);
        state.dispenseItem("pepsi");
    }
}
