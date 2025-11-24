import Pair.Pair;

import java.util.HashMap;
import java.util.Random;

public class GameServiceImpl implements Game{
    Integer m=3,n=3;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes=new HashMap<>();
    HashMap<Pair<Integer,Integer>, Pair<Integer,Integer>> ladders=new HashMap<>();
    Pair<Integer,Integer> currentIndex;
    Integer [][]board;
    Player playerOne,playerTwo;
    GameServiceImpl(Player playerOne,Player playerTwo) {
        snakes.put(new Pair<Integer, Integer>(2,2),new Pair<Integer, Integer>(1,0));
        ladders.put(new Pair<Integer, Integer>(1,1),new Pair<Integer, Integer>(2,3));
        board=new Integer[m][n];
        currentIndex=new Pair<Integer, Integer>(0,0);
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
    }
    @Override
    public void processTurn(Pair<Integer,Integer> currentIndex,Player player) {
        if(!snakes.containsKey(currentIndex) && !ladders.containsKey(currentIndex)) {
            return ;
        }
        if(snakes.containsKey(currentIndex)) {
            player.setCurrentIndex(snakes.get(currentIndex));
            processTurn(player.getCurrentIndex(),player);
        }
        if(ladders.containsKey(currentIndex)) {
            player.setCurrentIndex(ladders.get(currentIndex));
            processTurn(player.getCurrentIndex(),player);
        }
    }

    @Override
    public void SnakeAndLadder() {
        String Winner="";
        boolean Turn=true;
        Random random=new Random();
        while(true) {
            Integer StartX=random.nextInt(m);
            Integer StartY=random.nextInt(n);
            currentIndex=new Pair<Integer, Integer>(StartX,StartY);
            if(Turn) {
                processTurn(currentIndex,playerOne);
                Turn=!Turn;
            }
            else if(!Turn) {
                processTurn(currentIndex,playerTwo);
                Turn=!Turn;
            }
            if(StartX==(m-1) && StartY==(n-1)) {
                Winner=Turn? playerOne.getName() : playerTwo.getName();
                break;
            }
        }
        System.out.println("Winner : "+Winner);
    }
}
