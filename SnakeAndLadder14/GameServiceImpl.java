import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Random;

public class GameServiceImpl implements Game{
    Integer [][] board;
    Integer m,n;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders;
    Pair<Integer,Integer> currentPosition;
    Player playerOne,playerTwo;
    public GameServiceImpl(HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> snakes, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> ladders,Player playerOne,Player playerTwo) {
        this.snakes = snakes;
        this.ladders = ladders;
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
        this.currentPosition=new Pair<>(0,0);
        this.m=3;
        this.n=3;
        this.board=new Integer[m][n];
    }

    @Override
    public void startGame() {
        boolean turn=true;
        String Winner=new String();
        Random random=new Random();
        while(true) {
            Integer StartX=random.nextInt(m);
            Integer StartY=random.nextInt(n);
            currentPosition=new Pair<>(StartX,StartY);
            board[StartX][StartY]=turn?1 : 2;
            if(turn) {
                processTurn(playerOne,currentPosition);
            }
            else if(!turn) {
                processTurn(playerTwo,currentPosition);
            }
            if(StartX==(m-1) && StartY==(n-1)) {
                Winner=turn?playerOne.getName() :playerTwo.getName();
                break;
            }
            turn=!turn;
        }
        System.out.println("Winner : "+Winner);
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
