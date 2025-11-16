import Pair.Pair;

public class Player {
    public Integer id;
    public String name;
    public Pair<Integer,Integer> currentIndex;


    public Piece piece;
    public Player(Integer id, String name,Piece piece) {
        this.id = id;
        this.name = name;
        this.piece=piece;
        this.currentIndex=new Pair<Integer, Integer>(0,0);
    }

    public Piece getPiece() {
        return this.piece;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pair<Integer, Integer> getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(Pair<Integer, Integer> currentIndex) {
        this.currentIndex = currentIndex;
    }



}
