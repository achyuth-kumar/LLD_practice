import java.util.HashMap;
import java.util.Random;

public class GameServiceImpl implements Game{

    Integer[][] board;
    Integer m,n;
    Player playerOne,playerTwo;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes,ladders;
    public GameServiceImpl(Integer[][] board, Integer m, Integer n, Player playerOne, Player playerTwo, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> snakes, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> ladders) {
        this.board = board;
        this.m = m;
        this.n = n;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.snakes = snakes;
        this.ladders = ladders;
    }
    @Override
    public void startGame() {
        boolean turn=true;
        Pair<Integer,Integer> currentPosition;
        Random random=new Random();
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
