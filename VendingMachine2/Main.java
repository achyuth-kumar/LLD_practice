public class Main {
    public static void main(String [] args) {
        VendingMachine machine=new VendingMachine();
        States stateObject=machine.getStateObject("active");
        stateObject.InsertCoin(Coin.TWENTY.getValue(),Item.SPRITE);

//        States stateObject=machine.getStateObject("idle");
//        stateObject.InsertCoin(Coin.FIVE.getValue(),Item.SPRITE);

    }
}
