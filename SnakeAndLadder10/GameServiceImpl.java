import Pair.Pair;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public class GameServiceImpl implements Game{
    Integer [][] board;
    Integer m=3,n=3;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes=new HashMap<>();
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders=new HashMap<>();
    Pair<Integer,Integer> CurrentIndex;
    Player playerOne,playerTwo;
    public GameServiceImpl(Player playerOne,Player playerTwo) {
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
        this.board = new Integer[m][n];
        this.CurrentIndex=new Pair<Integer, Integer>(0,0);
        this.CurrentIndex.first=0;
        this.CurrentIndex.second=0;
        this.playerOne.setCurrentIndex(CurrentIndex);
        this.playerTwo.setCurrentIndex(CurrentIndex);
        snakes.put(new Pair<Integer, Integer>(2,1),new Pair<Integer, Integer>(1,1));
        ladders.put(new Pair<Integer, Integer>(1,1),new Pair<Integer, Integer>(2,2));
    }

    @Override
    public void ProcessTurn(Pair<Integer, Integer> currentIndex, Player player) {
        if(!snakes.containsKey(currentIndex) && !ladders.containsKey(currentIndex)) {
            player.setCurrentIndex(currentIndex);
            return;
        }
        if(snakes.containsKey(currentIndex)) {
            player.setCurrentIndex(snakes.get(currentIndex));
            ProcessTurn(player.getCurrentIndex(),player);
        }
        if(ladders.containsKey(currentIndex)) {
            player.setCurrentIndex(ladders.get(currentIndex));
            ProcessTurn(player.getCurrentIndex(),player);
        }
    }

    @Override
    public void SnakeAndLadder() {
        Boolean Turn=true;
        String Winner=new String();
        Random random=new Random();
        while(true) {
            Integer StartX=random.nextInt(m);
            Integer StartY=random.nextInt(n);
            CurrentIndex.first=StartX;
            CurrentIndex.second=StartY;
            System.out.println(CurrentIndex.first+" : "+ CurrentIndex.second);
            if(Turn) {
                ProcessTurn(CurrentIndex,playerOne);
                Turn= false;
            }
            else {
                ProcessTurn(CurrentIndex,playerTwo);
                Turn= true;
            }
            if(playerTwo.getCurrentIndex().first==(m - 1) && playerTwo.getCurrentIndex().second==(n - 1)) {
                Winner=playerTwo.getName();
                break;
            }
            if(playerOne.getCurrentIndex().first==(m - 1) && playerOne.getCurrentIndex().second==(n - 1)) {
                Winner=playerOne.getName();
                break;
            }
        }
        System.out.println("Winner : "+Winner);
    }
}
