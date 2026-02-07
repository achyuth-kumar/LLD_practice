import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Random;

public class GameServiceImpl implements Game{
    Integer m,n;
    Player playerOne;
    Player playerTwo;
    Integer [][]board;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders;
    Pair<Integer,Integer> currentPosition;
    public GameServiceImpl(Player playerOne, Player playerTwo, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> snakes, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> ladders) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.snakes = snakes;
        this.ladders = ladders;
        this.m=3;
        this.n=3;
        this.currentPosition=new Pair<>();
        this.board=new Integer[m][n];
    }
    @Override
    public void startGame() {
        boolean turn=true;
        String Winner=new String();
        Random random=new Random();
        while(true) {
            Integer startX=random.nextInt(m);
            Integer startY=random.nextInt(n);
            board[startX][startY]=turn?1:2;
            currentPosition=new Pair<>(startX,startY);
            if(turn) {
                processTurn(playerOne,currentPosition);
            }
            else if(!turn) {
               processTurn(playerTwo,currentPosition);
            }
            turn=!turn;
            if(startX==(m-1) && startY==(n-1)) {
                Winner=turn? playerOne.getName() : playerTwo.getName();
                break;
            }
        }
        System.out.println("Winner : "+Winner);
    }

    @Override
    public void processTurn(Player player,Pair<Integer,Integer> currentPosition) {
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
