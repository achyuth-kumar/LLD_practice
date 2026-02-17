public class GameServiceImpl implements Game{


    Player WhitePlayer,BlackPlayer;
    Integer m,n;
    Cell [][]board;
    public GameServiceImpl(Player whitePlayer, Player blackPlayer) {
        this.m=8;
        this.n=8;
        this.WhitePlayer = whitePlayer;
        this.BlackPlayer = blackPlayer;
        this.board=new Cell[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                board[i][j]=new Cell(i,j);
            }
        }
    }
    @Override
    public void startGame(Piece piece, Integer startX, Integer startY, Integer endX, Integer endY) {
        for(int j=0;j<n;j++) {
            board[1][j].setPiece(new Pawn(Colour.White));
            board[6][j].setPiece(new Pawn(Colour.Black));
        }
        board[0][0].setPiece(new Rook(Colour.White));
        board[0][1].setPiece(new Knight(Colour.White));
        board[0][2].setPiece(new Bishop(Colour.White));
        board[0][3].setPiece(new Queen(Colour.White));
        board[0][4].setPiece(new King(Colour.White));
        board[0][5].setPiece(new Bishop(Colour.White));
        board[0][6].setPiece(new Knight(Colour.White));
        board[0][7].setPiece(new Rook(Colour.White));

        board[7][0].setPiece(new Rook(Colour.Black));
        board[7][1].setPiece(new Knight(Colour.Black));
        board[7][2].setPiece(new Bishop(Colour.Black));
        board[7][3].setPiece(new Queen(Colour.Black));
        board[7][4].setPiece(new King(Colour.Black));
        board[7][5].setPiece(new Bishop(Colour.Black));
        board[7][6].setPiece(new Knight(Colour.Black));
        board[7][7].setPiece(new Rook(Colour.Black));
        boolean turn=true;
        while(!isCheckmate() && !isStalemate()) {
            processTurn(piece, startX, startY, endX, endY);
            turn=!turn;
        }
        if(isCheckmate()) {
            System.out.println("Winner : "+(turn?WhitePlayer.getName():BlackPlayer.getName()));
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
