import java.util.Random;

public class gameServiceImpl implements game{
    Integer m,n;
    Piece [][]board;
    Player playerOne,playerTwo;
    public gameServiceImpl(Player playerOne,Player playerTwo) {
        this.m = 3;
        this.n=3;
        board=new Piece[m][n];
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
    }

    @Override
    public void startGame() {
        String Winner=new String();
        boolean turn=true;
        Random random=new Random();
        while(true) {
            Integer startX=random.nextInt(m);
            Integer startY=random.nextInt(n);
            board[startX][startY]=turn?playerOne.getPiece(): playerTwo.getPiece();
            for(int i=0;i<m;i++) {
                if(board[i][0]!=null && board[i][0]==board[i][1] && board[i][1]==board[i][2]) {
                    Winner=(board[i][0]==Piece.O)? playerOne.getName():playerTwo.getName();
                    break;
                }
                if(board[0][i]!=null && board[0][i]==board[1][i] && board[1][i]==board[2][i]) {
                    Winner=(board[0][i]==Piece.O)? playerOne.getName():playerTwo.getName();
                    break;
                }
                if(board[0][0]!=null && board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
                    Winner=(board[0][0]==Piece.O)? playerOne.getName():playerTwo.getName();
                    break;
                }
                if(board[0][2]!=null && board[0][2]==board[1][1] && board[1][1]==board[2][0]) {
                    Winner=(board[0][2]==Piece.O)? playerOne.getName():playerTwo.getName();
                    break;
                }
            }
            if(!Winner.isEmpty()) {
                break;
            }
            turn=!turn;
        }
        System.out.println("Winner : "+Winner);
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(board[i][j]!=null) {
                    System.out.print(board[i][j]+" ");
                }
                else {
                    System.out.print("-1"+" ");
                }
            }
            System.out.println();
        }
    }
}
