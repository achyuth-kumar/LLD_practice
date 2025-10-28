public class IdleStateImpl implements VendingMachine{
    @Override
    public void InsertCoin(Coin coin) {
        System.out.println("Vending Machine is in Idle State");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println("Vending Machine is in Idle State");
    }

    @Override
    public boolean ValidateProduct(Coin coin,Item item) {
        System.out.println("Vending Machine is in Idle State");
        return false;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println("Vending Machine is in Idle State");
    }
}
