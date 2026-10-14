import java.util.Random;

public class GameServiceImpl implements Game{


    Piece [][] board;
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
        Random random=new Random();
        boolean turn=true;
        String winner=new String();
        while (true) {
           Integer startX=random.nextInt(m);
           Integer startY=random.nextInt(n);
           board[startX][startY]=turn?playerOne.getPiece():playerTwo.getPiece();
           for(int j=0;j<n;j++) {
               if(board[j][0]!=null && board[j][0]==board[j][1] && board[j][1]==board[j][2]) {
                   winner=turn? playerOne.getName() : playerTwo.getName();
                   break;
               }
               if(board[0][j]!=null && board[0][j]==board[1][j] && board[1][j]==board[2][j]) {
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
               break;
           }
           turn=!turn;
        }
        System.out.println("Winner : "+winner);
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
