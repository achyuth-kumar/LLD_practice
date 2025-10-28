public class HasMoneyStateImpl implements VendingMachine{
    @Override
    public void InsertCoin(Coin coin) {
        System.out.println(coin.getValue()+" has been inserted");
    }

    @Override
    public void ChooseProduct(Item item) {
        System.out.println("Vending Machine is in Has Money State");
    }

    @Override
    public boolean ValidateProduct(Coin coin,Item item) {
        System.out.println("Vending Machine is in Has Money State");
        return false;
    }

    @Override
    public void DispenseItem(Item item) {
        System.out.println("Vending Machine is in Has Money State");
    }
}
