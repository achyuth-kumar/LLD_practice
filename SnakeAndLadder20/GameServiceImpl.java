import java.util.HashMap;
import java.util.Random;

public class GameServiceImpl implements Game{
    Player playerOne,playerTwo;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes,ladders;
    Integer m,n;
    Integer [][]board;
    public GameServiceImpl(Player playerOne,Player playerTwo,HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> snakes, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> ladders) {
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
        this.snakes = snakes;
        this.ladders = ladders;
        this.m=3;
        this.n=3;
        this.board=new Integer[m][n];
    }
    @Override
    public void startGame() {
        String Winner=new String();
        boolean turn=true;
        Random random=new Random();
        Pair<Integer,Integer> currentPosition;
        while (true) {
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
            if(startX==(m-1) && startY==(n-1)) {
                Winner=turn? playerOne.getName() : playerTwo.getName();
                break;
            }
            turn=!turn;
        }
        System.out.println("Winner : "+Winner);
    }

    @Override
    public void processTurn(Player player,Pair<Integer,Integer> currentPosition) {
        if (!snakes.containsKey(currentPosition) && !ladders.containsKey(currentPosition)) {
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
