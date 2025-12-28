import Pair.Pair;

import java.security.interfaces.DSAKey;
import java.util.HashMap;
import java.util.Random;

public class GameServiceImpl implements Game{


    Player playerOne,playerTwo;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> snakes;
    HashMap<Pair<Integer,Integer>,Pair<Integer,Integer>> ladders;
    Integer board[][];
    Integer m,n;
    Pair<Integer,Integer> CurrentPosition;
    public GameServiceImpl(Player playerOne, Player playerTwo) {
        this.m=3;
        this.n=3;
        this.snakes=new HashMap<>();
        this.ladders=new HashMap<>();
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        Pair<Integer,Integer> Source=new Pair<Integer, Integer>();
        Source.first=1;
        Source.second=1;
        Pair<Integer,Integer> Destination=new Pair<Integer, Integer>();
        Destination.first=0;
        Destination.second=0;
        this.snakes.put(Source,Destination);

        Source=new Pair<Integer, Integer>();
        Source.first=2;
        Source.second=0;
        Destination=new Pair<Integer, Integer>();
        Destination.first=1;
        Destination.second=0;
        this.snakes.put(Source,Destination);

        Source=new Pair<Integer, Integer>();
        Source.first=0;
        Source.second=2;
        Destination=new Pair<Integer, Integer>();
        Destination.first=1;
        Destination.second=2;
        this.ladders.put(Source,Destination);
        this.board=new Integer[m][n];
        this.CurrentPosition=new Pair<Integer, Integer>(0,0);
    }

    @Override
    public void ProcessTurn(Player player, Pair<Integer, Integer> CurrentPosition) {
        if(!snakes.containsKey(CurrentPosition) && !ladders.containsKey(CurrentPosition)) {
            player.setPosition(CurrentPosition);
            return ;
        }
        if(snakes.containsKey(CurrentPosition)) {
            player.setPosition(snakes.get(CurrentPosition));
            ProcessTurn(player,player.getPosition());
        }
        if(ladders.containsKey(CurrentPosition)) {
            player.setPosition(ladders.get(CurrentPosition));
            ProcessTurn(player,player.getPosition());
        }
    }
    @Override
    public void StartGame() {
        Random random=new Random();
        Boolean Turn=true;
        String Winner=new String();
        while(true) {
            Integer StartX= random.nextInt(m);
            Integer StartY= random.nextInt(n);
            CurrentPosition=new Pair<Integer, Integer>();
            CurrentPosition.first=StartX;
            CurrentPosition.second=StartY;
            if(Turn) {
                ProcessTurn(playerOne,CurrentPosition);
                Turn=false;
            }
            else if(!Turn) {
                ProcessTurn(playerTwo,CurrentPosition);
                Turn=true;
            }
            if(playerOne.getPosition().first.equals(m-1) && playerOne.getPosition().second.equals(n-1)) {
                Winner= playerOne.getName();
                break;
            }
            if(playerTwo.getPosition().first.equals(m-1) && playerTwo.getPosition().second.equals(n-1)) {
                Winner= playerTwo.getName();
                break;
            }
        }
        System.out.println("Winner : "+Winner);
    }
}
