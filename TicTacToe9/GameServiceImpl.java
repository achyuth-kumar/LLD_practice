import java.util.Random;

public class GameServiceImpl implements Game{
    Piece [][] board;
    Integer m,n;
    Player playerOne,playerTwo;
    public GameServiceImpl(Player playerOne,Player playerTwo) {
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
        this.m=3;
        this.n=3;
        this.board = new Piece[m][n];
    }

    @Override
    public void startGame() {
        Random random=new Random();
        boolean turn=true;
        String Winner=new String();
        while(true) {
            Integer StartX=random.nextInt(m);
            Integer StartY=random.nextInt(m);
            board[StartX][StartY]=turn?playerOne.getPiece() : playerTwo.getPiece();
            for(int i=0;i<m;i++) {
                if(board[i][0]!=null && board[i][0]==board[i][1] && board[i][1]==board[i][2]) {
                    Winner=(board[i][0]==playerOne.getPiece())? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[0][i]!=null && board[0][i]==board[1][i] && board[1][i]==board[2][i]) {
                    Winner=(board[0][i]==playerOne.getPiece())? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[0][0]!=null && board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
                    Winner=(board[0][0]==playerOne.getPiece())? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[0][2]!=null && board[0][2]==board[1][1] && board[1][1]==board[2][0]) {
                    Winner=(board[0][2]==playerOne.getPiece())? playerOne.getName() : playerTwo.getName();
                    break;
                }
            }
            turn=!turn;
            if(!Winner.isEmpty()) {
                break;
            }
        }
        System.out.println("Winner : "+Winner);
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(board[i][j]!=null) {
                    System.out.print(board[i][j] + " ");
                }
                else {
                    System.out.print("-1" + " ");
                }
            }
            System.out.println();
        }
    }
}
