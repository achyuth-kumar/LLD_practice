import java.util.HashMap;
import java.util.Random;

public class GameServiceImpl implements Game{

    Player playerOne,playerTwo;
    Integer [][] board;
    Integer m,n;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes,ladders;
    public GameServiceImpl(Player playerOne, Player playerTwo, Integer[][] board, Integer m, Integer n, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> snakes, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> ladders) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.board = board;
        this.m = m;
        this.n = n;
        this.snakes = snakes;
        this.ladders = ladders;
    }
    @Override
    public void startGame() {
        boolean turn=true;
        Random random=new Random();
        Pair<Integer,Integer> currentPosition;
        while(true) {
            Integer startX=random.nextInt(m);
            Integer startY=random.nextInt(n);
            board[startX][startY]=turn?1:2;
            currentPosition=new Pair<>(startX,startY);
            if(turn) {
                processTurn(playerOne,currentPosition);
            }
            else {
                processTurn(playerTwo,currentPosition);
            }
            turn=!turn;
            if(startX==(m-1) && startY==(n-1)) {
                System.out.println("Winner : "+(turn?playerOne.getName():playerTwo.getName()));
                break;
            }
        }
    }

    @Override
    public void processTurn(Player player, Pair<Integer, Integer> currentPosition) {
        if(!snakes.containsKey(currentPosition) && !ladders.containsKey(currentPosition)) {
            player.setCurrentPosition(currentPosition);
            return ;
        }
        if(snakes.containsKey(currentPosition)) {
            player.setCurrentPosition(snakes.get(currentPosition));
            processTurn(player,player.getCurrentPosition());
        }
        if(ladders.containsKey(currentPosition)) {
            player.setCurrentPosition(ladders.get(currentPosition));
            processTurn(player,player.getCurrentPosition());
        }
    }
}
