import java.util.ArrayList;
import java.util.List;

public class Board {
    Piece[][] grid=new Piece[8][8];
    List<PieceType> pieceTypeList=new ArrayList<>();
    Board() {
        pieceTypeList.add(PieceType.ELEPHANT);
        pieceTypeList.add(PieceType.CAMEL);
        pieceTypeList.add(PieceType.HORSE);
        pieceTypeList.add(PieceType.QUEEN);
        pieceTypeList.add(PieceType.KING);
        pieceTypeList.add(PieceType.HORSE);
        pieceTypeList.add(PieceType.CAMEL);
        pieceTypeList.add(PieceType.ELEPHANT);
    }
    void intialise() {
        for(int i=0;i<8;i++) {
            for(int j=0;flag && j<pieceTypeList.size();j++) {
                grid[0][i] = new Piece(Colour.WHITE, 0, i, pieceTypeList.get(i));
            }
            flag=
            grid[1][i]=new Piece(Colour.WHITE,1,i,PieceType.SOLDIER);
            grid[6][i]=new Piece(Colour.BLACK,6,i,PieceType.SOLDIER);
            grid[7][i]=new Piece(Colour.BLACK,6,i,);
        }
    }
    public void print() {
        S.O.P(grid);
    }
}
