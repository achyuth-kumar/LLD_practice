public class PlayerOne extends Players{
    public int pos[][];
    public String name;
    public PlayerOne(int pos, String name) {
        super(pos, name);
    }
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

}
