import java.util.HashMap;
import java.util.Random;

public class GameServiceImpl implements Game{
    Integer [][] board;
    Integer m,n;
    Player playerOne;
    Player playerTwo;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes,ladder;

    public GameServiceImpl(Integer[][] board, Integer m, Integer n, Player playerOne, Player playerTwo, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> snakes, HashMap<Pair<Integer, Integer>, Pair<Integer, Integer>> ladder) {
        this.board = board;
        this.m = m;
        this.n = n;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.snakes = snakes;
        this.ladder = ladder;
    }


    @Override
    public void startGame() {
        boolean turn=true;
        Random random=new Random();
        Pair<Integer,Integer> currentPosition;
        while (true) {
            Integer startX=random.nextInt(m);
            Integer startY=random.nextInt(n);
            board[startX][startY]=turn? playerOne.getId(): playerTwo.getId();
            currentPosition=new Pair<>(startX,startY);
            if(turn) {
                processTurn(playerOne,currentPosition);
            }
            else {
                processTurn(playerTwo,currentPosition);
            }
            if(startX==(m-1) && startY==(n-1)) {
                System.out.println("Winner : "+(turn?playerOne.getName():playerTwo.getName()));
                break;
            }
            turn=!turn;
        }
    }

    @Override
    public void processTurn(Player player, Pair<Integer, Integer> currentPosition) {
        if (!snakes.containsKey(currentPosition) && !ladder.containsKey(currentPosition)) {
            player.setCurrentPosition(currentPosition);
            return ;
        }
        if (snakes.containsKey(currentPosition)) {
            player.setCurrentPosition(snakes.get(currentPosition));
            processTurn(player,player.getCurrentPosition());
        }
        if (ladder.containsKey(currentPosition)) {
            player.setCurrentPosition(ladder.get(currentPosition));
            processTurn(player,player.getCurrentPosition());
        }
    }
}
