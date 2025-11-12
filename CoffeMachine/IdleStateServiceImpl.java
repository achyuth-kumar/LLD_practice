public class IdleStateServiceImpl implements CoffeeMachine{
    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Coffee Machine is in Idle State");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("Coffee Machine is in Idle State");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        System.out.println("Coffee Machine is in Idle State");
        return false;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("Coffee Machine is in Idle State");
    }
}
