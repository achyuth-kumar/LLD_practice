public class PlayerTwo extends Players{
    public int pos;
    public String name;
    public PlayerTwo(int pos, String name) {
        super(pos, name);
    }
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}
