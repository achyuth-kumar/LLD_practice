import Pair.Pair;

import java.util.HashMap;
import java.util.Random;

public class Game {
    Integer m=3,n=3;
    Integer [][] board=new Integer[m][n];
    HashMap<Pair<Integer,Integer>, Pair<Integer,Integer>> snakes=new HashMap<>();
    HashMap<Pair<Integer,Integer>, Pair<Integer,Integer>> ladders=new HashMap<>();
    Player playerOne,playerTwo;
    Pair<Integer,Integer> CurrentIndex;
    Game(Player playerOne,Player playerTwo) {
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
        CurrentIndex=new Pair<Integer, Integer>(0,0);
        snakes.put(new Pair<Integer, Integer>(2,2),new Pair<Integer, Integer>(1,1));
        snakes.put(new Pair<Integer, Integer>(0,2),new Pair<Integer, Integer>(1,2));
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
        Integer StartX=0,StartY=0;
        Random random=new Random();
        boolean Turn=true;
        String Winner="";
        while (true) {
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
                else if(!Turn) {
                    Winner= playerTwo.getName();
                }
                break;
            }
        }
        System.out.println("Winner : "+Winner);
    }

}
