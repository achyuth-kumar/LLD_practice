public class GameServiceImpl implements Game{
    Cell [][]board;
    Integer m,n;

    Player whitePlayer,blackPlayer;

    public GameServiceImpl(Player whitePlayer,Player blackPlayer) {
        this.blackPlayer = blackPlayer;
        this.whitePlayer = whitePlayer;
        this.m=8;
        this.n=8;
        this.board=new Cell[m][n];
    }

    @Override
    public void startGame(Piece piece,Integer startX,Integer startY,Integer endX,Integer endY) {
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                board[i][j]=new Cell(i,j);
            }
        }
        for(int j=0;j<n;j++) {
            board[1][j].setPiece(new Pawn(Colour.WHITE));
            board[6][j].setPiece(new Pawn(Colour.BLACK));
        }
        board[0][0].setPiece(new Rook(Colour.WHITE));
        board[0][1].setPiece(new Knight(Colour.WHITE));
        board[0][2].setPiece(new Bishop(Colour.WHITE));
        board[0][3].setPiece(new Queen(Colour.WHITE));
        board[0][4].setPiece(new King(Colour.WHITE));
        board[0][5].setPiece(new Bishop(Colour.WHITE));
        board[0][6].setPiece(new Knight(Colour.WHITE));
        board[0][7].setPiece(new Rook(Colour.WHITE));


        board[7][0].setPiece(new Rook(Colour.BLACK));
        board[7][1].setPiece(new Knight(Colour.BLACK));
        board[7][2].setPiece(new Bishop(Colour.BLACK));
        board[7][3].setPiece(new Queen(Colour.BLACK));
        board[7][4].setPiece(new King(Colour.BLACK));
        board[7][5].setPiece(new Bishop(Colour.BLACK));
        board[7][6].setPiece(new Knight(Colour.BLACK));
        board[7][7].setPiece(new Rook(Colour.BLACK));

        boolean turn=true;
        while(!isCheckmate() || !isStalemate()) {
            processTurn(piece,startX,startY,endX,endY);
            turn=!turn;
        }
        if(isCheckmate()) {
            System.out.println("Winner  : " + (turn ? whitePlayer.getName() : blackPlayer.getName()));
        }
        if(isStalemate()) {
            System.out.println("Chess ended in stale moves");
        }
    }

    @Override
    public void processTurn(Piece piece,Integer startX,Integer startY,Integer endX,Integer endY) {
        Cell from=new Cell(startX,startY);
        Cell to=new Cell(endX,endY);
        if(piece.validate(board,from,to)) {
            board[startX][startY].setPiece(null);
            board[endX][endY].setPiece(to.getPiece());
        }
        else {
            System.out.println("Invalid move");
        }
    }
    public boolean isCheckmate() {
        // implement check mate
        return true;
    }
    public boolean isStalemate() {
        //implement stalemate
        return true;
    }

}
