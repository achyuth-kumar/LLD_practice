public class DispenseStateImpl implements VendingMachine{
    @Override
    public void InsertCoin(Coin coin) {
        System.out.println("Vending machine is in Dispense State");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println("Vending machine is in Dispense State");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        System.out.println("Vending machine is in Dispense State");
        return false;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println(item+" have been Dispensed");
    }
}
