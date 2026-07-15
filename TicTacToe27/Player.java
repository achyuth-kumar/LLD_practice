public class Player {
    Integer Id;
    String name;
    Piece piece;


    public Player(Integer id, String name, Piece piece) {
        Id = id;
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }



}
