public class HasMoneyStateServiceImpl implements VendingMachine{
    @Override
    public void insertCoin(Coin coin) {
        System.out.println(coin+" : has been inserted");
        System.out.println("Vending Machine is in Has Money state");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Vending Machine is in Has Money state");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        System.out.println("Vending Machine is in Has Money state");
        return false;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Vending Machine is in Has Money state");
    }
}
