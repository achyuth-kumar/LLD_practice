public class Main {
    public static void main(String [] args) {
        VendingMachine vendingMachine=new IdleStateImpl();
        vendingMachine.InsertCoin(Coin.FIVE);

        Coin amount=Coin.TEN;
        Item item=Item.COKE;
        vendingMachine=new HasMoneyStateImpl();
        vendingMachine.InsertCoin(amount);


        vendingMachine=new WorkingStateImpl();
        vendingMachine.ChooseProduct(item);
        boolean  validate = vendingMachine.ValidateProduct(amount,item);

        if(validate) {
            vendingMachine=new DispenseStateImpl();
            vendingMachine.DispenseItem(item);
        }
        else {
            System.out.println("Cannot invoke Dispense state since validation falied");
        }
    }
}
