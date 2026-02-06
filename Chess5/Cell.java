public class Cell {

    public Piece piece;


    public Integer row,col;
    public Cell(Integer row, Integer col) {
        this.row = row;
        this.col = col;
    }
    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }
}
