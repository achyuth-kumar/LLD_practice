import java.util.Random;

public class GameBoard {
    public Integer board[][]=new Integer[3][3];
    public boolean turn=false;
    int win=-1,turnRowValue=0,turnColumnValue=0,m=3,n=3;
    GameBoard() {
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                board[i][j]=-1;
            }
        }
    }
    public void Game(Player playerOne,Player playerTwo) {
        Random random=new Random();
        while(win==-1) {
           turnRowValue=random.nextInt(m);
           turnColumnValue=random.nextInt(n);
           if(!turn) {
                board[turnRowValue][turnRowValue]=0;
           }
            else {
               board[turnRowValue][turnRowValue]=1;
            }
            for(int i=0;i<m;i++) {
                if (board[i][0] !=-1  && board[i][0] == board[i][1] & board[i][1] == board[i][2]) {
                    win = board[i][0];
                    break;
                }
                else if (board[0][i] != -1 && board[0][i] == board[1][i] & board[1][i] == board[2][i]) {
                    win = board[i][0];
                    break;
                }
            }
            if(board[0][2]!=-1 && board[0][2]==board[1][1] && board[1][1]==board[2][0]) {
                win = board[0][2];
                break;
            }
            else if(board[0][0]!=-1 && board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
                win = board[0][0];
                break;
            }
            if(win!=-1) {
                break;
            }
           turn=!turn;
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        if(win==0) {
            System.out.println("["+playerOne.getName()+" : "+playerOne.getPiece()+"] :  won");
        }
        else if(win==1){
            System.out.println("["+playerTwo.getName()+" : "+playerTwo.getPiece()+"] :  won");
        }
    }

}
