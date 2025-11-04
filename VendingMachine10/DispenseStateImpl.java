public class DispenseStateImpl implements VendingMachine{
    @Override
    public void InsertCoin(Coin coin) {
        System.out.println("Vending machine is in Dispense state");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println("Vending machine is in Dispense state");
    }

    @Override
    public boolean ValidateProduct(Coin coin, Item item) {
        System.out.println("Vending machine is in Dispense state");
        return false;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println(item+" item has dispensed");
    }
}
