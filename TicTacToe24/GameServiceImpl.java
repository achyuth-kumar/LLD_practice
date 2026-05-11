import java.util.Random;

public class GameServiceImpl implements Game{
    Piece[][] board;
    Integer m,n;
    Player playerOne,playerTwo;
    public GameServiceImpl(Piece[][] board, Integer m, Integer n, Player playerOne, Player playerTwo) {
        this.board = board;
        this.m = m;
        this.n = n;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    @Override
    public void startGame() {
        boolean turn=true;
        Random random=new Random();
        String winner=new String();
        while(true) {
            Integer startX=random.nextInt(m);
            Integer startY=random.nextInt(n);
            board[startX][startY]=turn?playerOne.getPiece():playerTwo.getPiece();
            for(int i=0;i<m;i++) {
                if(board[i][0]!=null && board[i][0]==board[i][1] && board[i][1]==board[i][2]) {
                    winner=turn? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[0][i]!=null && board[0][i]==board[1][i] && board[1][i]==board[2][i]) {
                    winner=turn? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[0][0]!=null && board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
                    winner=turn? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[0][2]!=null && board[0][2]==board[1][1] && board[1][1]==board[2][0]) {
                    winner=turn? playerOne.getName() : playerTwo.getName();
                    break;
                }
            }
            if(!winner.isEmpty()) {
                System.out.println("WInner : "+winner);
                break;
            }
            turn=!turn;
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(board[i][j]!=null) {
                    System.out.print(board[i][j]+" ");
                }
                else {
                    System.out.print("-"+" ");
                }
            }
            System.out.println();
        }
    }
}
