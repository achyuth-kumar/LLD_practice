import Pair.Pair;

import java.awt.image.CropImageFilter;
import java.util.HashMap;
import java.util.Random;

public class Game {
    Integer m=3,n=3;
    Integer [][]Board=new Integer[m][n];
    HashMap<Pair<Integer,Integer>, Pair<Integer,Integer>> snakes=new HashMap<>();
    HashMap<Pair<Integer,Integer>, Pair<Integer,Integer>> ladders=new HashMap<>();
    Pair<Integer,Integer> CurrentPosition;
    Player playerOne,playerTwo;
    Game(Player playerOne,Player playerTwo) {
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
        CurrentPosition= new Pair<Integer, Integer>(0,0);
        snakes.put(new Pair<Integer,Integer>(3,1),new Pair<Integer, Integer>(1,2));
        ladders.put(new Pair<Integer,Integer>(1,1),new Pair<Integer, Integer>(3,2));
    }
    public void ProcessTurn(Pair<Integer,Integer> CurrentPosition, Player player) {
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
            if(StartX==(m-1) && StartY==(n-1)) {
                if(Turn) {
                    Winner=playerOne.getName();
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
