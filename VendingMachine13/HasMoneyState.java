public class HasMoneyState implements VendingMachine{
    @Override
    public void insertCoin(Coin coin) {
        System.out.println(coin+" : has been inserted");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Vending Machine is in HasMoney State");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        System.out.println("Vending Machine is in HasMoney State");
        return false;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Vending Machine is in HasMoney State");
    }
}
