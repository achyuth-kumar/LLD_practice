public class DispenseStateServiceImpl implements  VendingMachine{
    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Vending machine is in Dispense state");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Vending machine is in Dispense state");

    }

    @Override
    public boolean validateProduct(Coin coin,Item item) {
        System.out.println("Vending machine is in Dispense state");
        return false;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println(item+" : item Dispensed");
    }
}
