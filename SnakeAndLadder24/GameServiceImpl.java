import java.util.HashMap;
import java.util.Random;

public class GameServiceImpl implements Game {


    Player playerOne,playerTwo;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes,ladders;
    Integer [][] board;
    Integer m,n;
    public GameServiceImpl(Player playerOne, Player playerTwo, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> snakes, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> ladders, Integer[][] board, Integer m, Integer n) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.snakes = snakes;
        this.ladders = ladders;
        this.board = board;
        this.m = m;
        this.n = n;
    }
    @Override
    public void startGame() {
        Random random=new Random();
        Pair<Integer,Integer> currentPosition;
        boolean turn=true;
        while(true) {
            Integer startX=random.nextInt(m);
            Integer startY=random.nextInt(n);
            currentPosition=new Pair<>(startX,startY);
            board[startX][startY]=turn?1:2;
            if(turn) {
                processTurn(playerOne,currentPosition);
            }
            else {
                processTurn(playerTwo,currentPosition);
            }
            turn=!turn;
            if(startX==(m-1) && startY==(n-1)) {
                break;
            }
        }
        System.out.println("Winner : ");
        if(turn) {
            System.out.println(playerOne.getName());
        }
        else {
            System.out.println(playerTwo.getName());
        }
    }

    @Override
    public void processTurn(Player player, Pair<Integer, Integer> currentPosition) {
        if(!snakes.containsKey(currentPosition) && !ladders.containsKey(currentPosition)) {
            player.setCurrentPosition(currentPosition);
            return;
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
