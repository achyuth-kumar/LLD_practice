public class IdleStateServiceImpl implements VendingMachine{
    @Override
    public void pleaseInsertCoin(Coin coin) {
        System.out.println("Vending Machine is in Idle State");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Vending Machine is in Idle State");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        System.out.println("Vending Machine is in Idle State");
        return false;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Vending Machine is in Idle State");
    }
}
