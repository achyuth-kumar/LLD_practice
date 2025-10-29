import Pair.Pair;

import java.util.HashMap;
import java.util.Random;
import java.util.Stack;

public class Game {
    int m=3,n=3;
    Integer [][] board=new Integer[m][n];
    Pair<Integer,Integer> CurrentValue=new Pair<Integer, Integer>(0,0);
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes=new HashMap<>();
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders=new HashMap<>();
    Player playerOne,playerTwo;
    Game(Player p1,Player p2) {
        snakes.put(new Pair<Integer, Integer>(1,2),new Pair<Integer, Integer>(0,2));
        ladders.put(new Pair<Integer, Integer>(1,0),new Pair<Integer, Integer>(2,2));
        this.playerOne=p1;
        this.playerTwo=p2;
    }
    public void ProcessTurn(Pair<Integer,Integer> CurrentValue, Player player) {
        if(!snakes.containsKey(CurrentValue) && !ladders.containsKey(CurrentValue)) {
            return ;
        }
        if(snakes.containsKey(CurrentValue)) {
            player.setCurrentValue(snakes.get(CurrentValue));
            ProcessTurn(player.getCurrentValue(),player);
        }
        if(ladders.containsKey(CurrentValue)) {
            player.setCurrentValue(ladders.get(CurrentValue));
            ProcessTurn(player.getCurrentValue(),player);
        }
    }
    public void SnakeAndLadder() {
        boolean Turn=true;
        Integer StartX=0,StartY=0;
        Random random=new Random();
        String Winner="";
        while(true) {
            StartX=random.nextInt(m);
            StartY=random.nextInt(n);
            CurrentValue=new Pair<Integer, Integer>(StartX,StartY);
            if(Turn) {
                ProcessTurn(CurrentValue,playerOne);
                Turn= !Turn;
            }
            else if(!Turn) {
                ProcessTurn(CurrentValue,playerTwo);
                Turn=!Turn;
            }
            if(StartX==(m-1) && StartY==(n-1)) {
                if(Turn) {
                    Winner= playerOne.getName();
                }
                else {
                    Winner= playerTwo.getName();
                }
                break;
            }
        }
        System.out.println("Winner : "+Winner);
    }
}
