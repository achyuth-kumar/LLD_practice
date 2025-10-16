public class HasMoneyStateImpl implements  VendingMachine{
    @Override
    public void InsertCoin(Coin coin) {
        System.out.println(coin.getValue()+" coin got inserted");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println("Vending machine is in HasMoneyState");
    }

    @Override
    public boolean ValidateProduct(Coin coin,Item item) {
        System.out.println("Vending machine is in HasMoneyState");
        return false;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println("Vending machine is in HasMoneyState");
    }
}
