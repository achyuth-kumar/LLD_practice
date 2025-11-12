public class Main {
    public static void main(String[] args) {
            Coin coin=Coin.TWENTY;
            Item item=Item.STRONG_COFFEE;
            CoffeeMachine coffeeMachine=new IdleStateServiceImpl();
            coffeeMachine.insertCoin(coin);

            coffeeMachine=new HasMoneyStateServiceImpl();
            coffeeMachine.insertCoin(coin);

            coffeeMachine=new WorkingStateServiceImpl();
            coffeeMachine.chooseProduct(item);
            if(coffeeMachine.validateProduct(coin,item)) {
                coffeeMachine=new DispenseStateServiceImpl();
                coffeeMachine.dispenseItem(item);
            }

    }
}
