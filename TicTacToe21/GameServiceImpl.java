import java.util.Random;

public class GameServiceImpl implements Game{
    Player playerOne,playerTwo;
    Piece [][] board;
    Integer m,n;

    public GameServiceImpl(Piece[][] board, Player playerOne, Player playerTwo, Integer m, Integer n) {
        this.board = board;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.m = m;
        this.n = n;
    }
    @Override
    public void startGame() {
        Random random=new Random();
        boolean turn=true;
        String Winner=new String();
        while(true) {
            Integer startX=random.nextInt(m);
            Integer startY=random.nextInt(n);
            board[startX][startY]=turn?playerOne.getPiece():playerTwo.getPiece();
            for(int i=0;i<m;i++) {
                if(board[i][0]!=null && board[i][0]==board[i][1] && board[i][1]==board[i][2]) {
                    Winner=turn? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[0][i]!=null && board[0][i]==board[1][i] && board[1][i]==board[2][i]) {
                    Winner=turn? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[0][0]!=null && board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
                    Winner=turn? playerOne.getName() : playerTwo.getName();
                    break;
                }
                if(board[0][2]!=null && board[0][2]==board[1][1] && board[1][1]==board[2][0]) {
                    Winner=turn? playerOne.getName() : playerTwo.getName();
                    break;
                }
            }
            turn=!turn;
            if(!Winner.isEmpty()) {
                System.out.println("Winner : "+Winner);
                break;
            }
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
