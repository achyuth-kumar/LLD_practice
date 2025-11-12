public class HasMoneyStateServiceImpl implements CoffeeMachine{
    @Override
    public void insertCoin(Coin coin) {
        System.out.println(coin.getValue()+" : coin is inserted");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Coffee machine is in HasMoney State");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        System.out.println("Coffee machine is in HasMoney State");
        return false;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Coffee machine is in HasMoney State");
    }
}
