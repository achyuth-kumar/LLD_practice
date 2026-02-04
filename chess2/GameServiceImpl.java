public class GameServiceImpl implements  Game{
    Cell [][] board;
    Player whitePlayer,blackPlayer;
    Integer m,n;

    public GameServiceImpl(Player whitePlayer, Player blackPlayer) {
        this.m=8;
        this.n=8;
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
        this.board=new Cell[m][n];
    }
    @Override
    public void startGame(Piece piece,Integer startX,Integer startY,Integer endX,Integer endY) {
        Cell opponentPiece=board[endX][endY];
//        board[0][1]= new Bishop();
        //Iniliaze rest elements
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                board[i][j]=new Cell(i,j);
            }
        }
        board[0][0].setPiece(new Rook(Colour.WHITE));
        board[0][1].setPiece(new Knight(Colour.WHITE));
        board[0][2].setPiece(new Bishop(Colour.WHITE));
        board[0][3].setPiece(new Queen(Colour.WHITE));
        board[0][4].setPiece(new King(Colour.WHITE));
        board[0][5].setPiece(new Bishop(Colour.WHITE));
        board[0][6].setPiece(new Knight(Colour.WHITE));
        board[0][7].setPiece(new Rook(Colour.WHITE));

        for(int j=0;j<n;j++) {
            board[1][j].setPiece(new Bishop(Colour.WHITE));
            board[m-2][j].setPiece(new Bishop(Colour.BLACK));
        }

        board[m-1][0].setPiece(new Rook(Colour.BLACK));
        board[m-1][1].setPiece(new Knight(Colour.BLACK));
        board[m-1][2].setPiece(new Bishop(Colour.BLACK));
        board[m-1][3].setPiece(new Queen(Colour.BLACK));
        board[m-1][4].setPiece(new King(Colour.BLACK));
        board[m-1][5].setPiece(new Bishop(Colour.BLACK));
        board[m-1][6].setPiece(new Knight(Colour.BLACK));
        board[m-1][7].setPiece(new Rook(Colour.BLACK));

        boolean winner=false,turn=true;
        while(!isCheckmake() || !isStalemate()) {
            processTurn(piece,startX,startY,endX,endY);
            turn=!turn;
        }
        System.out.println("Winner : "+(turn?whitePlayer.getName(): blackPlayer.getName()));
    }

    @Override
    public void processTurn(Piece piece,Integer startX,Integer startY,Integer endX,Integer endY) {
        Cell from=new Cell(startX,startY);
        Cell to=new Cell(endX,endY);
        if(piece.validateMove(from,to,board)) {
            Cell opponentCell=board[endX][endY];
            board[endX][endY].setPiece(opponentCell.getPiece());
        }
        else {
            System.out.println("Invalid move");
        }
    }

    public boolean isCheckmake() {
        //implement checkmate logic
        return true;
    }
    public boolean isStalemate() {
        //implement stalemate logic
        return true;
    }



}
