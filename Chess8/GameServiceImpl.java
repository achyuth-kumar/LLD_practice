import java.util.concurrent.BrokenBarrierException;

public class GameServiceImpl implements Game{


    Player WhitePlayer,BlackPlayer;
    Integer m,n;
    Cell [][]board;
    public GameServiceImpl(Player whitePlayer, Player blackPlayer) {
        this.WhitePlayer = whitePlayer;
        this.BlackPlayer = blackPlayer;
        this.m=6;
        this.n=8;
        this.board=new Cell[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                this.board[i][j]=new Cell(i,j);
            }
        }
    }

    @Override
    public void startGame(Piece piece, Integer startX, Integer startY, Integer endX, Integer endY) {
        for(int j=0;j<n;j++) {
            board[1][j].setPiece(new Pawn(Colour.White));
            board[m-2][j].setPiece(new Pawn(Colour.Black));
        }
        board[0][0].setPiece(new Rook(Colour.White));
        board[0][1].setPiece(new Knight(Colour.White));
        board[0][2].setPiece(new Bishop(Colour.White));
        board[0][3].setPiece(new Queen(Colour.White));
        board[0][4].setPiece(new King(Colour.White));
        board[0][5].setPiece(new Bishop(Colour.White));
        board[0][6].setPiece(new Knight(Colour.White));
        board[0][7].setPiece(new Rook(Colour.White));

        board[m-1][0].setPiece(new Rook(Colour.Black));
        board[m-1][1].setPiece(new Knight(Colour.Black));
        board[m-1][2].setPiece(new Bishop(Colour.Black));
        board[m-1][3].setPiece(new Queen(Colour.Black));
        board[m-1][4].setPiece(new King(Colour.Black));
        board[m-1][5].setPiece(new Bishop(Colour.Black));
        board[m-1][6].setPiece(new Knight(Colour.Black));
        board[m-1][7].setPiece(new Rook(Colour.Black));
        boolean turn=true;
        while(!isCheckmate() && !isStalemate()) {
            processTurn(piece,startX,startY,endX,endY);
            turn=!turn;
        }
        if(isCheckmate()) {
            System.out.println("Winner : "+(turn? WhitePlayer.getName() : BlackPlayer.getName()));
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
            board[from.getRow()][from.getCol()].setPiece(null);
            board[to.getRow()][to.getCol()].setPiece(piece);
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
