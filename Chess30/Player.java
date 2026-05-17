public class Player {
    Integer ID;
    String name;

    Colour colour;


    public Player(Integer ID, String name, Colour colour) {
        this.ID = ID;
        this.name = name;
        this.colour = colour;
    }
    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }



}
