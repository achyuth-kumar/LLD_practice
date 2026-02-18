public class GameServiceImpl implements Game{


    Player WhitePlayer,BlackPlayer;
    Integer m,n;
    Cell [][]board;
    public GameServiceImpl(Player whitePlayer, Player blackPlayer) {
        this.WhitePlayer = whitePlayer;
        this.BlackPlayer = blackPlayer;
        this.m=8;
        this.n=8;
        this.board=new Cell[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                board[i][j]=new Cell(i,j);
            }
        }
    }
    @Override
    public void startGame(Piece piece, Integer startX, Integer startY, Integer endX, Integer endY) {
        boolean turn=true;
        while(!isCheckmate() && !isStalemate()) {
            processTurn(piece, startX, startY, endX, endY);
            turn=!turn;
        }
        if(isCheckmate()) {
            System.out.println("Winner : "+(turn?WhitePlayer.getName() : BlackPlayer.getName()));
        }
        if(isStalemate()) {
            System.out.println("Chess ended in stalemate");
        }
    }

    @Override
    public void processTurn(Piece piece, Integer startX, Integer startY, Integer endX, Integer endY) {
        Cell from=new Cell(startX,startY);
        Cell to=new Cell(endX,endY);
        if(piece.validateMove(board,from,to)) {
            board[startX][startY].setPiece(null);
            board[endX][endY].setPiece(piece);
        }
        else {
            System.out.println("Invalid move");
        }
    }

    @Override
    public boolean isCheckmate() {
        return true;
    }

    @Override
    public boolean isStalemate() {
        return true;
    }
}
