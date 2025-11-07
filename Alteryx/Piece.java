import java.util.HashMap;

public class Piece {
    Colour colour;
    int x,y;
    PieceType type;
    public Piece(Colour colour, int x, int y,PieceType type) {
        this.colour = colour;
        this.x = x;
        this.y = y;
        this.type=type;
    }
    // (white) (2,2) -> (1,2)
    // (1,2) -> soldier (white)
    // p=Piece(black,1,2,soldier)
//    p.isValidMove(grid, 3,4)
    public boolean isValidMove(Piece [][]grid,int newX,int newY,Piece OpponentPiece) {
        if(grid[newX][newY] && grid[newX][newY].colour()==this.getColour()) {
            return false;
        }
        int dir=(colour==Colour.WHITE)? -1:1;
        return (newX==x+dir && newY==y);
    }
}
