public class Main {
    public static void main(String [] args) {
        Coin coin=Coin.TWENTY;
        Item item=Item.PEPSI;
        VendingMachine IdleState=new IdleStateImpl();
        IdleState.InsertCoin(coin);

        VendingMachine HasMoney=new HasMoneyStateImpl();
        HasMoney.InsertCoin(coin);

        VendingMachine WorkingState=new WorkingStateImpl();

        if(WorkingState.ValidateProduct(coin,item)) {
            VendingMachine DispenseState=new DispenseStateImpl();
            DispenseState.DispenseItem(item);
        }

    }
}
