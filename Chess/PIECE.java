import Pair.Pair;

class Piece {

    public PieceType Type;
    public Colour colour;

    public Pair<Integer,Integer> Position;

    public Piece(Pair<Integer, Integer> position) {
        this.Position = position;
    }

    public Pair<Integer, Integer> getPosition() {
        return Position;
    }

    public void setPosition(Pair<Integer, Integer> position) {
        Position = position;
    }
    public PieceType getType() {
        return Type;
    }

    public void setType(PieceType type) {
        Type = type;
    }
    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
}
