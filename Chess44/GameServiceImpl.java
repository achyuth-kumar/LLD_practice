public class GameServiceImpl implements Game{
    Cell [][] board;
    Player blackPlayer,whitePlayer;
    Integer m,n;
    public GameServiceImpl(Cell[][] board, Player blackPlayer, Player whitePlayer, Integer m, Integer n) {
        this.board = board;
        this.blackPlayer = blackPlayer;
        this.whitePlayer = whitePlayer;
        this.m = m;
        this.n = n;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                this.board[i][j]=new Cell(i,j);
            }
        }
    }
    @Override
    public void startGame(Piece piece, Integer startX, Integer startY, Integer endX, Integer endY) {
        for(int j=0;j<n;j++) {
            this.board[1][j].setPiece(new Pawn(Colour.Black));
            this.board[6][j].setPiece(new Pawn(Colour.White));
        }
        board[0][0].setPiece(new Rook(Colour.Black));
        board[0][1].setPiece(new Knight(Colour.Black));
        board[0][2].setPiece(new Bishop(Colour.Black));
        board[0][3].setPiece(new King(Colour.Black));
        board[0][4].setPiece(new Queen(Colour.Black));
        board[0][5].setPiece(new Bishop(Colour.Black));
        board[0][6].setPiece(new Knight(Colour.Black));
        board[0][7].setPiece(new Rook(Colour.Black));

        board[7][0].setPiece(new Rook(Colour.White));
        board[7][1].setPiece(new Knight(Colour.White));
        board[7][2].setPiece(new Bishop(Colour.White));
        board[7][3].setPiece(new King(Colour.White));
        board[7][4].setPiece(new Queen(Colour.White));
        board[7][5].setPiece(new Bishop(Colour.White));
        board[7][6].setPiece(new Knight(Colour.White));
        board[7][7].setPiece(new Rook(Colour.White));

        boolean turn=true;
        while(!isCheckmate() && !isStalemate()) {
            processTurn(piece, startX, startY, endX, endY);
            turn=!turn;
        }
        if(isCheckmate()) {
            System.out.println(turn?blackPlayer.getName():whitePlayer.getName());
        }
        if(isStalemate()) {
            System.out.println("Chess ended in Stalemate");
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
            System.out.println("Invalid Move");
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
