public class GameServiceImpl implements Game{
    Cell [][] board;
    Integer m,n;
    Player whitePlayer,blackPlayer;
    public GameServiceImpl(Cell[][] board, Integer m, Integer n, Player whitePlayer, Player blackPlayer) {
        this.board = board;
        this.m = m;
        this.n = n;
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
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
        this.board[0][0].setPiece(new Rook(Colour.Black));
        this.board[0][1].setPiece(new Knight(Colour.Black));
        this.board[0][2].setPiece(new Bishop(Colour.Black));
        this.board[0][3].setPiece(new King(Colour.Black));
        this.board[0][4].setPiece(new Queen(Colour.Black));
        this.board[0][5].setPiece(new Bishop(Colour.Black));
        this.board[0][6].setPiece(new Knight(Colour.Black));
        this.board[0][7].setPiece(new Rook(Colour.Black));


        this.board[7][0].setPiece(new Rook(Colour.White));
        this.board[7][1].setPiece(new Knight(Colour.White));
        this.board[7][2].setPiece(new Bishop(Colour.White));
        this.board[7][3].setPiece(new King(Colour.White));
        this.board[7][4].setPiece(new Queen(Colour.White));
        this.board[7][5].setPiece(new Bishop(Colour.White));
        this.board[7][6].setPiece(new Knight(Colour.White));
        this.board[7][7].setPiece(new Rook(Colour.White));
        boolean turn=true;
        while(!isStalemate() && !isCheckmate()) {
            processTurn(piece, startX, startY, endX, endY);
            turn=!turn;
        }
        if(isCheckmate()) {
            System.out.println("winner : "+(turn?whitePlayer.getName():blackPlayer.getName()));
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
            board[startX][startY].setPiece(piece);
            board[endX][endY].setPiece(null);
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
