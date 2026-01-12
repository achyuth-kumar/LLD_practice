import java.util.Currency;
import java.util.Random;

public class GameServiceImpl implements Game{

    Integer m,n;
    Player playerOne,playerTwo;
    Piece [][]board;
    Pair<Integer,Integer> CurrentPosition;
    public GameServiceImpl(Player playerOne, Player playerTwo) {
        this.m=3;
        this.n=3;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        board=new Piece[m][n];
        this.CurrentPosition=new Pair<>(0,0);
    }
    @Override
    public void StartGame() {
        Random random=new Random();
        boolean turn=true;
        String Winner=new String();
        while(true) {
            Integer StartX=random.nextInt(m);
            Integer StartY=random.nextInt(n);
            board[StartX][StartY]=turn?Piece.O : Piece.X;
            turn=!turn;
            for(int i=0;i<m;i++) {
                if(board[i][0]!=null && board[i][0]==board[i][1] && board[i][1]==board[i][2]) {
                    Winner=(board[i][0]==Piece.O) ? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[0][i]!=null && board[0][i]==board[1][i] && board[1][i]==board[2][i]) {
                    Winner=(board[0][i]==Piece.O) ? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[0][0]!=null && board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
                    Winner=(board[0][0]==Piece.O) ? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[0][2]!=null && board[0][2]==board[1][1] && board[1][1]==board[2][0]) {
                    Winner=(board[0][2]==Piece.O) ? playerOne.getName() : playerTwo.getName();
                    break;
                }
            }
            if(!Winner.isEmpty()) {
                System.out.println("Winner : "+Winner);
                for(int i=0;i<m;i++) {
                    for(int j=0;j<n;j++) {
                        if(board[i][j]!=null) {
                            System.out.print(board[i][j] + " ");
                        }
                        else {
                            System.out.print("[]");
                        }
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}

