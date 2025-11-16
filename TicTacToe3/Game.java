import Pair.Pair;

import java.util.Random;

public class Game {
    int m=3,n=3;
    public Piece [][]board;
    Player playerOne,playerTwo;
    public Pair<Integer,Integer> currentIndex;
    Game(Player playerOne,Player playerTwo) {
        board=new Piece[m][n];
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
        this.currentIndex=new Pair<Integer, Integer>(0,0);
    }
    public void TicTacToe() {
        boolean Turn=true;
        // playerOne - O
        // playerTwo - X
        Random random=new Random();
        String Winner="";
        while(true) {
            int startX= random.nextInt(m);
            int startY= random.nextInt(n);
            currentIndex=new Pair<Integer, Integer>(startX,startY);
            if(Turn) {
                board[startX][startY] = playerOne.getPiece();
                playerOne.setCurrentIndex(currentIndex);
                Turn=!Turn;
            }
            else if(!Turn) {
                board[startX][startY] = playerTwo.getPiece();
                playerTwo.setCurrentIndex(currentIndex);
                Turn=!Turn;
            }
            for(int i=0;i<m;i++) {
                //same row
                if(board[i][0]!=null && board[i][0]==board[i][1] && board[i][1]==board[i][2]) {
                    Winner= ((board[i][0]==Piece.O) ? playerOne.getName() : playerTwo.getName());
                    break;
                }
                //same column
                if(board[0][i]!=null && board[0][i]==board[1][i] && board[1][i]==board[2][i]) {
                    Winner= ((board[0][i]==Piece.O) ? playerOne.getName() : playerTwo.getName());
                    break;
                }
                //same diagnol
                if(board[0][0]!=null && board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
                    Winner= ((board[0][0]==Piece.O) ? playerOne.getName() : playerTwo.getName());
                    break;
                }
                //same anti-diagnol
                if(board[0][2]!=null && board[0][2]==board[1][1] && board[1][1]==board[2][0]) {
                    Winner= ((board[0][2]==Piece.O) ? playerOne.getName() : playerTwo.getName());
                    break;
                }
            }
            if(!Winner.isEmpty()) {
                break;
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Winner : "+Winner);
    }

}
