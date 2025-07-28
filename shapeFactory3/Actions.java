public class Actions {
    public Machine getActions(String input) {
        if(input.equals("coin")) {
            return new Coin();
        }
        else if(input.equals("item")) {
            return new Item();
        }
        else 
            return null;
    }
}