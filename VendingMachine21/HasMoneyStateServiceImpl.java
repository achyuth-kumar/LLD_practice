public class HasMoneyStateServiceImpl implements VendingMachine{
    @Override
    public void pleaseInsertCoin(Coin coin) {
        System.out.println("Vending Machine is in Has Money State");
        System.out.println(coin.getValue()+" , coin has been inserted");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Vending Machine is in Has Money State");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        System.out.println("Vending Machine is in Has Money State");
        return false;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Vending Machine is in Has Money State");
    }
}
