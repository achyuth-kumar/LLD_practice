public class Main {
    public static void main(String [] args) {
        Player playerone=new Player(1,"Achyuth");
        Player playertwo=new Player(2,"Kumar");
        Game game=new Game(playerone,playertwo);
        game.SnakeAndLadder();
    }
}
