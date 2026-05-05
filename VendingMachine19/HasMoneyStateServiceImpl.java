public class HasMoneyStateServiceImpl implements VendingMachine{
    @Override
    public void pleaseInsertCoin(Coin coin) {
        System.out.println("Vending machine is in Has Money state");
        System.out.println(coin.getValue()+" : coin has been inserted");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Vending machine is in Has money state");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        System.out.println("Vending machine is in Has money state");
        return false;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Vending machine is in Has money state");
    }
}
