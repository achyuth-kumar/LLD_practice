public class IdleStateImpl implements VendingMachine{
    @Override
    public void InsertCoin(Coin coin) {
        System.out.println("Vending Machine is in Idle state");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println("Vending Machine is in Idle state");
    }

    @Override
    public boolean ValidateProduct(Coin coing, Item item) {
        System.out.println("Vending Machine is in Idle state");
        return false;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println("Vending Machine is in Idle state");
    }
}
