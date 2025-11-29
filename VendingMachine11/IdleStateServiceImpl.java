public class IdleStateServiceImpl implements VendingMachine{
    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Vending Machine is in idle state");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Vending Machine is in idle state");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        System.out.println("Vending Machine is in idle state");
        return false;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Vending Machine is in idle state");
    }
}
