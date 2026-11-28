public class Cell {
    Integer row;
    Integer col;
    Piece piece;

    public Cell(Integer row, Integer col) {
        this.row = row;
        this.col = col;
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

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

}
