import Pair.Pair;

import java.util.HashMap;
import java.util.Random;
import java.util.zip.InflaterInputStream;

public class Game {
    Integer m=3,n=3;
    Integer [][]board=new Integer[m][n];
    Player playerOne,playerTwo;
    HashMap<Pair<Integer,Integer>, Pair<Integer, Integer>> snakes=new HashMap<>();
    HashMap<Pair<Integer,Integer>, Pair<Integer, Integer>> ladders=new HashMap<>();
    Pair<Integer,Integer> CurrentIndex;
    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    public void ProcessTurn(Pair<Integer,Integer> CurrentIndex,Player player) {
       if(!snakes.containsKey(CurrentIndex) && !ladders.containsKey(CurrentIndex)) {
           return ;
       }
       if(snakes.containsKey(CurrentIndex)) {
           player.setCurrentIndex(snakes.get(CurrentIndex));
           ProcessTurn(player.getCurrentIndex(),player);
       }
       if(ladders.containsKey(CurrentIndex)) {
           player.setCurrentIndex(ladders.get(CurrentIndex));
           ProcessTurn(player.getCurrentIndex(),player);
       }
    }
    public void SnakeAndLadder() {
        boolean Turn=true;
        Random random=new Random();
        Integer StartX=0,StartY=0;
        String Winner="";
        while(true) {
            StartX=random.nextInt(m);
            StartY=random.nextInt(n);
            CurrentIndex=new Pair<Integer, Integer>(StartX,StartY);
            if(Turn) {
                ProcessTurn(CurrentIndex,playerOne);
                Turn=!Turn;
            }
            else if(!Turn) {
                ProcessTurn(CurrentIndex,playerTwo);
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

