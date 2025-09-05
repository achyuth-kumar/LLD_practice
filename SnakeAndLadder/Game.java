import java.util.HashMap;
import java.util.Random;

public class Game {
    HashMap<int[], int[]> snakes=new HashMap<int[], int[]>();
    HashMap<int [],int []> ladder=new HashMap<>();
    Board board;
    PlayerOne playerOne;
    PlayerTwo playerTwo;
    Game(Board board,PlayerOne playerOne,PlayerTwo playerTwo) {
        snakes.put(new int[]{3, 3},new int[]{4,5});
        ladder.put(new int[]{2,2},new int[]{10,15});
        this.board=board;
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
    }
    public void SnaKeAndLadder() {
        boolean turn=false;
        int n=5,win=0;
        while(win==0) {
            Random random=new Random();
            int rowTurnValue=random.nextInt(n);
            int columnTurnValue=random.nextInt(n);
            int []turnValue=new int[]{rowTurnValue,columnTurnValue};
            while(!turn && win==0) {
                int currentRowPosition= playerOne.getPosition()[0][0];
                int currentColumnPosition= playerOne.getPosition()[1][0];
                if(!snakes.containsKey(new int[]{currentRowPosition, currentColumnPosition}) && !ladder.containsKey(new int[]{currentRowPosition,currentColumnPosition})) {
                    turn=!turn;
                }
                if(snakes.containsKey(turnValue)) {
                    playerOne.setPosition(new int[][]{snakes.get(turnValue)});
                }
                if(ladder.containsKey(turnValue)) {
                    playerOne.setPosition(new int[][]{ladder.get(turnValue)});
                }
                if(rowTurnValue==(n-1) && columnTurnValue==(n-1)) {
                    win=1;
                    break;
                }
            }

            while(!turn && win==0) {
                int currentRowPosition= playerTwo.getPosition()[0][0];
                int currentColumnPosition= playerTwo.getPosition()[1][0];
                if(!snakes.containsKey(new int[]{currentRowPosition, currentColumnPosition}) && !ladder.containsKey(new int[]{currentRowPosition,currentColumnPosition})) {
                    turn=!turn;
                }
                if(snakes.containsKey(turnValue)) {
                    playerTwo.setPosition(new int[][]{snakes.get(turnValue)});
                }
                if(ladder.containsKey(turnValue)) {
                    playerTwo.setPosition(new int[][]{ladder.get(turnValue)});
                }
                if(rowTurnValue==(n-1) && columnTurnValue==(n-1)) {
                    win=1;
                    break;
                }
            }
        }
        if(win==1) {
            System.out.println("Winner : "+playerOne.getName());
        }
        if(win==2) {
            System.out.println("Winner : "+playerTwo.getName());
        }
    }
}
