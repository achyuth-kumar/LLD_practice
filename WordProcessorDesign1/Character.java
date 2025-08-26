public class Character {
    char c;
    String font;
    int size,row,col;
    Character(char c,String font,int size) {
        this.c=c;
        this.font=font;
        this.size=size;
    }
    public void display(int row,int col) {
        System.out.println(row+" : "+col);
    }
}
