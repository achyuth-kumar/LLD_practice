public class HasMoneyStateImpl implements VendingMachine{
    @Override
    public void InsertCoin(Coin coin) {
        System.out.println(coin+" have inserted");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println("Vending machine is in HasMoney state");
    }

    @Override
    public boolean validateProduct(Coin coin, Item item) {
        System.out.println("Vending machine is in HasMoney state");
        return false;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println("Vending machine is in HasMoney state");
    }
}
