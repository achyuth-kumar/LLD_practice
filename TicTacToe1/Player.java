public class Player {
    public int id;
    public String name;
    public Piece piece;
    public Player(int id, String name,Piece piece) {
        this.id = id;
        this.name = name;
        this.piece=piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

