public class IdleStateServiceImpl implements VendingMachine{
    @Override
    public void insertCoin(Coin coin) {
        System.out.println("vending machine is in Idle state");
    }

    @Override
    public void chooseProduct(Item item) {
        System.out.println("vending machine is in Idle state");

    }

    @Override
    public boolean validateProduct(Coin coin,Item item) {
        System.out.println("vending machine is in Idle state");
        return false;
    }

    @Override
    public void dispenseItem(Item item) {
        System.out.println("vending machine is in Idle state");

    }
}
