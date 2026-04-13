public class GameServiceImpl implements Game{


    Player whitePlayer,blackPlayer;
    Integer m,n;
    Cell [][] board;
    public GameServiceImpl(Player whitePlayer, Player blackPlayer, Integer m, Integer n, Cell[][] board) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
        this.m = m;
        this.n = n;
        this.board = board;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                this.board[i][j]=new Cell(i,j);
            }
        }
    }
    @Override
    public void startGame(Piece piece, Integer startX, Integer startY, Integer endX, Integer endY) {
        for(int j=0;j<n;j++) {
            board[1][j].setPiece(new Pawn(Colour.white));
            board[(m-2)][j].setPiece(new Pawn(Colour.black));
        }
        board[0][0].setPiece(new Rook(Colour.white));
        board[0][1].setPiece(new Knight(Colour.white));
        board[0][2].setPiece(new Bishop(Colour.white));
        board[0][3].setPiece(new King(Colour.white));
        board[0][4].setPiece(new Queen(Colour.white));
        board[0][5].setPiece(new Bishop(Colour.white));
        board[0][6].setPiece(new Knight(Colour.white));
        board[0][7].setPiece(new Rook(Colour.white));


        board[(m-1)][0].setPiece(new Rook(Colour.black));
        board[(m-1)][1].setPiece(new Knight(Colour.black));
        board[(m-1)][2].setPiece(new Bishop(Colour.black));
        board[(m-1)][3].setPiece(new King(Colour.black));
        board[(m-1)][4].setPiece(new Queen(Colour.black));
        board[(m-1)][5].setPiece(new Bishop(Colour.black));
        board[(m-1)][6].setPiece(new Knight(Colour.black));
        board[(m-1)][7].setPiece(new Rook(Colour.black));
        boolean turn=true;
        while(!isCheckmate() && !isStalemate()) {
            processTurn(piece,startX,startY,endX,endY);
            turn=!turn;
        }
        if(isCheckmate()) {
            System.out.println("Winner : "+(turn?whitePlayer.getName():blackPlayer.getName()));
        }
        if(isStalemate()) {
            System.out.println("Chess ended in stalemate");
        }
    }

    @Override
    public void processTurn(Piece piece, Integer startX, Integer startY, Integer endX, Integer endY) {
        Cell from=new Cell(startX,startY);
        Cell to=new Cell(endX,endY);
        if(piece.validate(board,from,to)) {
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
