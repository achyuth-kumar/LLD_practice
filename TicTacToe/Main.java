import java.util.*;
public class Main extends Player {

    public static void main(String argsp[]) {
        Player p1=new Player("1","Achyuth",false);
        Player p2=new Player("2","Kumar",false);
        boolean win=false;
        int m=3,n=3,res=0;
        Integer[][] Board=new Integer[m][n];    //player1 -> 1 , player2 -> 2
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                Board[i][j]=0;
            }
        }
        p1.turn=true;
        p2.turn=false;
        while (!win) {
            for (int i = 0; i < m; i++) {
                int f=0;
                for (int j = 0; j < n; j++) {
                    Random random = new Random();
                    int a = random.nextInt(m);
                    int b = random.nextInt(n);
                    if (Board[a][b]==0) {
                        if (p1.turn) {
                            Board[a][b] = 1;
                            p1.turn = !p1.turn;
                            p2.turn = !p2.turn;
                            f=1;
                        } else if (p2.turn) {
                            Board[a][b] = 2;
                            p2.turn = !p2.turn;
                            p1.turn = !p1.turn;
                            f=1;
                        }
                        break;
                    }
                }
                if(f==1)   break;
            }
            int diagnol = 1,row=1;
            for (int i = 1; i < m; i++) {
                row=1;
                int f=0;
                for (int j = 1; j < n; j++) {
                    if (Board[i][j] != 0) {
                        if (i == j && Board[i - 1][j - 1] == Board[i][j]) {
                            diagnol += 1;
                        }
                        if (Board[i][j] == Board[i][j - 1]) {
                            row += 1;
                        }
                    }
                    if (diagnol == m || row == m) {
                        res = Board[i][j];
                        win = true;
                        f=1;
                        break;
                    }
                }
                if(f==1)    break;
            }
            int col=1;
            for (int j = 1; j < n; j++) {
                col=1;
                int f=0;
                for (int i = 1; i < m; i++) {
                    if(Board[i][j]!=0) {
                        if (Board[i - 1][j] == Board[i][j]) {
                            col += 1;
                        }
                    }
                    if (col == n) {
                        res = Board[i][j];
                        win = true;
                        f=1;
                        break;
                    }
                }
                if(f==1)    break;
            }
            if (diagnol == m || row == m || col == n) {
                win = true;
                break;
            }
        }
        System.out.println("Game result : ");
        if(res==1) {
            System.out.println("Player1");
        }
        else if(res==2) {
            System.out.println("Player2");
        }
        System.out.println("Print board : ");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(Board[i][j]+" ");
            }
            System.out.println();
        }
    }
}