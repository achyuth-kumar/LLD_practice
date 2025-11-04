public class IdleStateImpl implements VendingMachine{
    @Override
    public void InsertCoin(Coin coin) {
        System.out.println("Vending machie is in idle state");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println("Vending machie is in idle state");
    }

    @Override
    public boolean ValidateProduct(Coin coin, Item item) {
        System.out.println("Vending machie is in idle state");
        return false;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println("Vending machie is in idle state");
    }
}
