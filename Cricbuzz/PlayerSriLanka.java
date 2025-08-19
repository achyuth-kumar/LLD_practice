public class PlayerSriLanka implements  Player{
    public int id;
    public String name;
    public int jerseyNo;
    public int score;
    public boolean out;
    public int type;
    PlayerSriLanka(int id,String name,int jerseyNo,int score,boolean out,int type) {
        this.id=id;
        this.name=name;
        this.jerseyNo=jerseyNo;
        this.score=score;
        this.out=out;
        this.type=type;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getJerseyNo() {
        return this.jerseyNo;
    }

    @Override
    public int getScore() {
        return this.score;
    }

    @Override
    public boolean getOut() {
        return this.out;
    }

    @Override
    public int getType() {
        return this.type;
    }
}
