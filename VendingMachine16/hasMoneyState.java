public class hasMoneyState implements VendingMachine{
    @Override
    public void insertCoin(Coin coin) {
        System.out.println(coin.getValue()+" : coin inserted");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Vending machine is in Has Money state");
    }

    @Override
    public boolean validateProdcut(Coin coin, Item item) {
        System.out.println("Vending machine is in Has Money state");
        return false;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Vending machine is in Has Money state");
    }
}
