import java.io.PipedReader;
import java.util.Random;

public class TicTacToeServiceImpl implements TicTacToe{
    Integer m=3,n=3;
    Piece [][]board;
    Player playerOne,playerTwo;
    public TicTacToeServiceImpl(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        board=new Piece[m][n];
    }
    @Override
    public void startGame() {
        String Winner=new String();
        Random random=new Random();
        boolean Turn=true;
        while(true) {
            Integer StartX=random.nextInt(m);
            Integer StartY=random.nextInt(n);
            board[StartX][StartY]=Turn? playerOne.getPiece() : playerTwo.getPiece();
            for(int i=0;i<m;i++) {
                //same row
                if(board[i][0]!=null && board[i][0]==board[i][1] && board[i][1]==board[i][2]) {
                    Winner=board[i][0]==Piece.O ? playerOne.getName() : playerTwo.getName();
                    break;
                }
                //same column
                if(board[0][i]!=null && board[0][i]==board[1][i] && board[1][i]==board[2][i]) {
                    Winner=board[0][i]==Piece.O ? playerOne.getName() : playerTwo.getName();
                    break;
                }
                //same diagnol
                if(board[0][0]!=null && board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
                    Winner=board[0][0]==Piece.O ? playerOne.getName() : playerTwo.getName();
                    break;
                }
                //same anti-diagnol
                if(board[2][0]!=null && board[2][0]==board[1][1] && board[1][1]==board[0][2]) {
                    Winner=board[0][0]==Piece.O ? playerOne.getName() : playerTwo.getName();
                    break;
                }
            }
            Turn=!Turn;
            if(!Winner.isEmpty()) {
                break;
            }
        }
        System.out.println("Winner : "+Winner);
        System.out.println("Board : ");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
