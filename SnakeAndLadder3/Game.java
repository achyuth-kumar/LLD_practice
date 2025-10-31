import Pair.Pair;

import java.util.HashMap;
import java.util.Random;

public class Game {
    Integer m=3,n=3;
    Integer [][]board=new Integer[m][n];
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes=new HashMap<>();
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders=new HashMap<>();
    Player playerOne,playerTwo;
    public Game(Player playerOne, Player playerTwo) {
        snakes.put(new Pair<Integer, Integer>(2,2),new Pair<Integer, Integer>(0,1));
        ladders.put(new Pair<Integer, Integer>(0,2),new Pair<Integer, Integer>(2,1));
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    private void ProcessTurn(Pair<Integer,Integer> CurrentPosition,Player player) {
        if(!snakes.containsKey(CurrentPosition) && !ladders.containsKey(CurrentPosition)) {
            return ;
        }
        if(snakes.containsKey(CurrentPosition)) {
            player.setCurrentPosition(snakes.get(CurrentPosition));
            ProcessTurn(player.getCurrentPosition(),player);
        }
        if(ladders.containsKey(CurrentPosition)) {
            player.setCurrentPosition(ladders.get(CurrentPosition));
            ProcessTurn(player.getCurrentPosition(),player);
        }
    }
    public void SnakeAndLadder() {
        boolean Turn=true;
        String Winner="";
        Integer StartX=0,StartY=0;
        Random random=new Random();
        Pair<Integer,Integer> CurrentPosition;
        while(true) {
            StartX=random.nextInt(m);
            StartY=random.nextInt(n);
            CurrentPosition=new Pair<Integer, Integer>(StartX,StartY);
            if(Turn) {
                ProcessTurn(CurrentPosition,playerOne);
                Turn=!Turn;
            }
            else if(!Turn) {
                ProcessTurn(CurrentPosition,playerTwo);
                Turn=!Turn;
            }
            if(StartX==(m-1) && StartY==(n-1)){
                if(Turn) {
                    Winner= playerOne.getName();
                }
                else  {
                    Winner= playerTwo.getName();
                }
                break;
            }
        }
        System.out.println("Winner : "+Winner);
    }

}
