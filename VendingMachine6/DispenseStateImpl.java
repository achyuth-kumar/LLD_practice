public class DispenseStateImpl implements  VendingMachine{
    @Override
    public void InsertCoin(Coin coin) {
        System.out.println("Vendimg machine is in dispense state");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println("Vendimg machine is in dispense state");
    }

    @Override
    public boolean ValidateProduct(Coin coin,Item item) {
        System.out.println("Vendimg machine is in dispense state");
        return false;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println(item + " dispensed ");
    }
}
