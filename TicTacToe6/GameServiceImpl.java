import java.util.Random;

public class GameServiceImpl implements Game{


    public Player playerOne,playerTwo;
    Piece board[][];
    Integer m,n;
    public GameServiceImpl(Player playerOne,Player playerTwo) {
        this.m=3;
        this.n=3;
        this.playerTwo = playerTwo;
        this.playerOne = playerOne;
        this.board=new Piece[m][n];
    }
    @Override
    public void StartGame() {
        Random random=new Random();
        String Winner=new String();
        boolean turn=true;
        while(true) {
            Integer StartX=random.nextInt(m);
            Integer StartY=random.nextInt(n);
            if(turn) {
                board[StartX][StartY]=Piece.O;
            }
            else if(!turn) {
                board[StartX][StartY]=Piece.X;
            }
            turn=!turn;
            for(int i=0;i<m;i++) {
                if(board[i][0]!=null && board[i][0]==board[i][1] && board[i][1]== board[i][2]) {
                    Winner=board[i][0]==Piece.O ? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[0][i]!=null && board[0][i]==board[1][i] && board[1][i]== board[2][i]) {
                    Winner=board[0][i]==Piece.O ? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[0][0]!=null && board[0][0]==board[1][1] && board[1][1]== board[2][2]) {
                    Winner=board[0][0]==Piece.O ? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[2][0]!=null && board[2][0]==board[1][1] && board[1][1]== board[0][2]) {
                    Winner=board[2][0]==Piece.O ? playerOne.getName() : playerTwo.getName();
                    break;
                }
            }
            if(!Winner.isEmpty()) {
                System.out.println("Winner : "+Winner);
                break;
            }
        }
        System.out.println("Board : ");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
