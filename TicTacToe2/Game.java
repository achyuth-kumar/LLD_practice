import Pair.Pair;

import java.util.Random;

public class Game {
    Player playerOne,playerTwo;
    int m=3,n=3;
    Piece [][]Board;
    Game(Player playerOne,Player playerTwo) {
        Board=new Piece[m][n];
        this.playerOne=playerOne;
        this.playerTwo=playerTwo;
    }
    public void TicTacToe() {
        Random random=new Random();
        boolean Turn=true;
        String Winner= "";
        while(true) {
            int StartX= random.nextInt(m);
            int StartY=random.nextInt(n);
            if(Turn) {
                playerOne.setCurrentIndex(new Pair<Integer,Integer>(StartX,StartY));
                Board[StartX][StartY]=playerOne.type;
                Turn=!Turn;
            }
            else if(!Turn) {
                playerTwo.setCurrentIndex(new Pair<Integer,Integer>(StartX,StartY));
                Board[StartX][StartY]=playerTwo.type;
                Turn=!Turn;
            }
            for(int i=0;i<m;i++) {
                if(Board[i][0]==Board[i][1] && Board[i][1]==Board[i][2]) {
                    if(Board[i][0]==Piece.O) {
                        Winner = playerOne.getName();
                        break;
                    }
                    else if(Board[i][0]==Piece.X) {
                        Winner = playerTwo.getName();
                        break;
                    }
                }
                if(Board[0][i]==Board[1][i] && Board[1][i]==Board[2][i]) {
                    if(Board[0][i]==Piece.O) {
                        Winner = playerOne.getName();
                        break;
                    }
                    else if(Board[0][i]==Piece.X) {
                        Winner = playerTwo.getName();
                        break;
                    }
                }
                if(Board[0][0]==Board[1][1] && Board[1][1]==Board[2][2]) {
                    if(Board[0][0]==Piece.O) {
                        Winner = playerOne.getName();
                        break;
                    }
                    else if(Board[0][0]==Piece.X) {
                        Winner = playerTwo.getName();
                        break;
                    }
                }
                if(Board[0][2]==Board[1][1] && Board[1][1]==Board[2][0]) {
                    if(Board[0][2]==Piece.O) {
                        Winner = playerOne.getName();
                        break;
                    }
                    else if(Board[0][2]==Piece.X) {
                        Winner = playerTwo.getName();
                        break;
                    }
                }
            }
            if(!Winner.isEmpty()) {
                break;
            }
        }
        System.out.println("Winner : "+Winner);
        System.out.println("Board : ");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(Board[i][j]+" ");
            }
            System.out.println();
        }
    }

}
