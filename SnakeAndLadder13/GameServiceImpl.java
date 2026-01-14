import java.util.HashMap;
import java.util.Random;

public class GameServiceImpl implements Game{


    Player playerOne,playerTwo;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes,ladders;
    Integer [][]board;
    Integer m,n;
    Pair<Integer,Integer> CurrentPosition;
    public GameServiceImpl(Player playerOne, Player playerTwo,HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes,HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.snakes=snakes;
        this.ladders=ladders;
        this.m=3;
        this.n=3;
        this.CurrentPosition=new Pair<>(0,0);
        this.board=new Integer[m][n];
    }
    @Override
    public void ProcessTurn(Player player, Pair<Integer, Integer> CurrentPosition) {
        if(!snakes.containsKey(CurrentPosition) && !ladders.containsKey(CurrentPosition)) {
            player.setCurrentPosition(CurrentPosition);
            return ;
        }
        if(snakes.containsKey(CurrentPosition)) {
            player.setCurrentPosition(snakes.get(CurrentPosition));
            ProcessTurn(player,player.getCurrentPosition());
        }
        if(ladders.containsKey(CurrentPosition)) {
            player.setCurrentPosition(ladders.get(CurrentPosition));
            ProcessTurn(player,player.getCurrentPosition());
        }
    }
    @Override
    public void StartGame() {
        boolean turn=true;
        Random random=new Random();
        String Winner=new String();
        while(true) {
            Integer StartX=random.nextInt(m);
            Integer StartY=random.nextInt(n);
            CurrentPosition=new Pair<>(StartX,StartY);
            if(turn) {
                ProcessTurn(playerOne,CurrentPosition);
                board[StartX][StartY]=1;
            }
            else if(!turn) {
                ProcessTurn(playerTwo,CurrentPosition);
                board[StartX][StartY]=2;
            }
            if(StartX==(m-1) && StartY==(n-1)) {
                Winner=(turn) ?playerOne.getName() : playerTwo.getName();
                break;
            }
            turn=!turn;
        }
        System.out.println("Winner : "+Winner);
    }


}
