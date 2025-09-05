public class PlayerOne implements Players{

    public int position[][];
    public String name;
    public PlayerOne(int[][] position, String name) {
        this.position=position;
        this.name=name;
    }
    public int[][] getPosition() {
        return this.position;
    }

    public void setPosition(int[][] position) {
        this.position = position;
    }
    public String getName() {
        return this.name;
    }
}
