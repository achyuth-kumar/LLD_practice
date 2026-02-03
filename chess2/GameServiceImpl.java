public class GameServiceImpl implements  Game{
    Piece [][] board;
    Player playerOne,playerTwo;
    Integer m,n;

    public GameServiceImpl(Player playerOne, Player playerTwo) {
        this.m=10;
        this.n=10;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.board=new Piece[m][n];
    }
    @Override
    public void startGame(Player player,Integer startX,Integer startY,Integer endX,Integer endY) {
        Piece opponentPiece=board[endX][endY];
//        board[0][1]= new PawnServiceImpl();
        //Iniliaze rest elements
        for(int j=0;j<n;j++) {
            board[1][j]=(Piece) new PawnServiceImpl(Colour.WHITE);
        }

        for(int j=0;j<n;j++) {
            board[m-2][j]=(Piece) new PawnServiceImpl(Colour.BLACK);
        }
        //Iniliaze rest elements
        processTurn(board[startX][startY],startX,startY,endX,endY);
    }

    @Override
    public void processTurn(Piece piece,Integer startX,Integer startY,Integer endX,Integer endY) {
        if(piece.validateMove(piece,startX,startY,endX,endY,board)) {
            Piece opponentPiece=board[endX][endY];
            board[startX][startY]=null;
            board[endX][endY]=piece;
        }
        else {
            System.out.println("Invalid move");
        }
    }

}
