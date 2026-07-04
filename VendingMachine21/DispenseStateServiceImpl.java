public class DispenseStateServiceImpl implements VendingMachine{
    @Override
    public void pleaseInsertCoin(Coin coin) {
        System.out.println("Vending Machine is in Dispense State");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Vending Machine is in Dispense State");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        System.out.println("Vending Machine is in Dispense State");
        return false;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Vending Machine is in Dispense State");
        System.out.println(item+" : item has been dispensed");
    }
}
