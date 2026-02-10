import java.util.Map;

public class Rook implements Piece{


    public  Colour colour;
    public Rook(Colour colour) {
        this.colour = colour;
    }

    @Override
    public boolean validateMove(Cell[][] board, Cell from, Cell to) {
        return (from.getRow()==to.getRow()) || (from.getCol()==to.getCol());
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }
}
