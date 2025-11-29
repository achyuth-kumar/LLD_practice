public class DispenseStateServiceImpl implements VendingMachine{
    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Vendine machine is in dispense state");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Vendine machine is in dispense state");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        System.out.println("Vendine machine is in dispense state");
        return false;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println(item+" : item Dispensed");
    }
}
