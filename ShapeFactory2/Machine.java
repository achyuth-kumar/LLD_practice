public class Machine {
    public Actions getAction(String input) {
        if(input.equals("coin")) {
            return new Coin();
        }
        else if(input.equals("item")) {
            return new Item();
        }
        else {
            return null;
        }
    }
}