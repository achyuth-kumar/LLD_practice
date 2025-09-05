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
    int [][] mat=board.getBoard();
    public void SnaKeAndLadder() {
        boolean turn=false;
        int n=5,win=0;
        while(win==0) {
            Random random=new Random();
            int rowTurnValue=random.nextInt(n);
            int columnTurnValue=random.nextInt(n);
            int []turnValue=new int[]{rowTurnValue,columnTurnValue};
            while(!turn && win==0) {
                int currentPosition= playerOne.getPos();
                if(!snakes.containsKey(currentPosition) && !ladder.containsKey(currentPosition)) {
                    turn=!turn;
                }
                if(snakes.containsKey(turnValue)) {
                    playerOne.setPos(snakes.get(turnValue));
                }
                if(ladder.containsKey(turnValue)) {
                    playerOne.setPos(ladder.get(turnValue));
                }
                if(rowTurnValue==(n-1) && columnTurnValue==(n-1)) {
                    win=1;
                    break;
                }
            }
            while(!turn && win==0) {
                int currentPosition= playerTwo.getPos();
                if(!snakes.containsKey(currentPosition) && !ladder.containsKey(currentPosition)) {
                    turn=!turn;
                }
                if(snakes.containsKey(turnValue)) {
                    playerTwo.setPos(snakes.get(turnValue));
                }
                if(ladder.containsKey(turnValue)) {
                    playerTwo.setPos(ladder.get(turnValue));
                }
            }
        }
    }
}
