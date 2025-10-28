import Pair.Pair;

import java.util.HashMap;
import java.util.Random;

public class Game {
    Integer m=3,n=3;
    Integer[][] board=new Integer[3][3];
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes,ladders;
    Player p1,p2;
    Game(Player p1,Player p2) {
        snakes=new HashMap<>();
        ladders=new HashMap<>();
        snakes.put(new Pair<Integer, Integer>(1, 2), new Pair<Integer,Integer>(0, 0));
        ladders.put(new Pair<Integer, Integer>(1, 1), new Pair<Integer,Integer>(2, 1));

        this.p1=p1;
        this.p2=p2;
    }
    void ProcessTurn(Pair<Integer,Integer> p,Player player) {
        if(!snakes.containsKey(p) && !ladders.containsKey(p)) {
            return ;
        }
        if(snakes.containsKey(p)) {
            player.CurrentValue=snakes.get(p);
            ProcessTurn(player.CurrentValue,player);
        }
        if(ladders.containsKey(p)) {
            player.CurrentValue=ladders.get(p);
            ProcessTurn(player.CurrentValue,player);
        }
    }
    public void SnakeAndLadder() {
        boolean PlayerOneTurn=true;
        Pair<Integer,Integer> CurrentIndex = new Pair<Integer, Integer>();
        CurrentIndex.first=0;
        CurrentIndex.second=0;
        p1.CurrentValue=CurrentIndex;
        String Winner="";
        Random random=new Random();
        while(true) {
            //Start with PlayerOne
            CurrentIndex.first=random.nextInt(m);
            CurrentIndex.second=random.nextInt(n);
            if(PlayerOneTurn) {
                ProcessTurn(CurrentIndex,p1);
                PlayerOneTurn=!PlayerOneTurn;
            }
            else if(!PlayerOneTurn) {
                ProcessTurn(CurrentIndex,p2);
                PlayerOneTurn=!PlayerOneTurn;
            }
            if(CurrentIndex.first==(m-1) && CurrentIndex.second==(n-1)) {
                if(PlayerOneTurn) {
                    Winner="Player-1";
                }
                else {
                    Winner="Player-2";
                }
                break;
            }
        }
        System.out.println("Winner : "+Winner);
    }
}

