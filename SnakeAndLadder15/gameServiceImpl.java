import java.util.HashMap;
import java.util.Random;

public class gameServiceImpl implements game{
    Player playerOne,playerTwo;
    Pair<Integer,Integer> currentPosition;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders;
    Integer [][]board;
    Integer m,n;
    public gameServiceImpl(Player playerOne,Player playerTwo, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> snakes, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> ladders) {
        this.playerTwo = playerTwo;
        this.playerOne = playerOne;
        this.snakes = snakes;
        this.ladders = ladders;
        this.currentPosition=new Pair<>(0,0);
        this.m=3;
        this.n=3;
        this.board=new Integer[m][n];
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

    @Override
    public void startGame() {
        String Winner=new String();
        boolean turn=true;
        Random random=new Random();
        while(true) {
            Integer startX=random.nextInt(m);
            Integer startY=random.nextInt(n);
            currentPosition=new Pair<>(startX,startY);
            board[startX][startY]=(turn)? 1 : 2;
            if(turn) {
                processTurn(playerOne,currentPosition);
            }
            else if(!turn) {
                processTurn(playerTwo,currentPosition);
            }
            if(startX==(m-1) && startY==(n-1)) {
                Winner=turn? playerOne.getName() : playerTwo.getName();
                break;
            }
            turn=!turn;
        }
        System.out.println("Winner : "+Winner);
    }
}
