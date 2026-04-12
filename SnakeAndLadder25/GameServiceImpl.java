import javax.swing.*;
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
        String winner=new String();
        Random random=new Random();
        while(true) {
            Integer startX=random.nextInt(m);
            Integer startY=random.nextInt(n);
            Pair<Integer,Integer> currentPosition=new Pair<>(startX,startY);
            board[startX][startY]=turn?1:2;
            if(turn) {
                processTurn(playerOne,currentPosition);
            }
            else if(!turn) {
                processTurn(playerTwo,currentPosition);
            }
            if(startX==(m-1) && startY==(n-1)) {
                winner=turn? playerOne.getName() : playerTwo.getName();
                break;
            }
            turn=!turn;
        }
        System.out.println("Winner : "+winner);
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
