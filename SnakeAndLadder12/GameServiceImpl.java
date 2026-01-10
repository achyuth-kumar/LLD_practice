import java.util.HashMap;
import java.util.Random;

public class GameServiceImpl implements Game{
    Integer Board[][];
    Integer m,n;

    Player playerOne,playerTwo;
    Pair<Integer,Integer> CurrentPosition;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes=new HashMap<>();
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders=new HashMap<>();
    public GameServiceImpl(Player playerOne, Player playerTwo,HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes,HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.m=3;
        this.n=3;
        this.Board=new Integer[m][n];
        this.CurrentPosition=new Pair<>(0,0);
        this.snakes=snakes;
        this.ladders=ladders;
    }
    @Override
    public void ProcessTurn(Player player,Pair<Integer,Integer> CurrentPosition) {
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
        Random random=new Random();
        Boolean turn=true;
        String Winner=new String();
        while(true) {
            Integer StartX=random.nextInt(m);
            Integer StartY=random.nextInt(n);
            CurrentPosition=new Pair<>(StartX,StartY);
            if(turn) {
                ProcessTurn(playerOne,CurrentPosition);
                turn=false;
                Board[playerOne.getCurrentPosition().first][playerOne.getCurrentPosition().second]=1;
            }
            else if(!turn) {
                ProcessTurn(playerTwo,CurrentPosition);
                turn=true;
                Board[playerTwo.getCurrentPosition().first][playerTwo.getCurrentPosition().second]=2;
            }
            if(CurrentPosition.first==(m-1) && CurrentPosition.second==(n-1)) {
                Winner=turn?playerOne.getName() : playerTwo.getName();
                break;
            }
        }
        System.out.println("Winner : "+Winner);
    }


}
