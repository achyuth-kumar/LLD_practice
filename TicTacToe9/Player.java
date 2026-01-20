public class Player {


    public Integer id;
    public String name;
    public Piece piece;

    public Player(Integer id, String name, Piece piece) {
        this.id = id;
        this.name = name;
        this.piece = piece;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }


}
