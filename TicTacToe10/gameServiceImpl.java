import java.util.Random;

public class gameServiceImpl implements game{

    Player playerOne,playerTwo;
    Piece board[][];
    Integer m,n;
    public gameServiceImpl(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.m=3;
        this.n=3;
        board=new Piece[m][n];
    }
    @Override
    public void startGame() {
        String winner=new String();
        Random random=new Random();
        boolean turn=true;
        while(true) {
            Integer startX=random.nextInt(m);
            Integer startY=random.nextInt(n);
            board[startX][startY]=turn? playerOne.getPiece() : playerTwo.getPiece();
            for(int i=0;i<m;i++) {
                if(board[i][0]!=null && board[i][0]==board[i][1] && board[i][1]==board[i][2]){
                    winner=(board[i][0]==Piece.O)?playerOne.getName():playerTwo.getName();
                    break;
                }
                if(board[0][i]!=null && board[0][i]==board[1][i] && board[1][i]==board[2][i]){
                    winner=(board[0][i]==Piece.O)?playerOne.getName():playerTwo.getName();
                    break;
                }
                if(board[0][0]!=null && board[0][0]==board[1][1] && board[1][1]==board[2][2]){
                    winner=(board[0][0]==Piece.O)?playerOne.getName():playerTwo.getName();
                    break;
                }
                if(board[0][2]!=null && board[0][2]==board[1][1] && board[1][1]==board[2][0]){
                    winner=(board[0][2]==Piece.O)?playerOne.getName():playerTwo.getName();
                    break;
                }
            }
            turn=!turn;
            if(!winner.isEmpty()) {
                break;
            }
        }
        System.out.println("Winner : "+winner);
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
