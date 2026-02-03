public class Player {
    public Integer id;
    public String name;
    public Colour colour;

    public Player(Integer id, String name, Colour colour) {
        this.id = id;
        this.name = name;
        this.colour = colour;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }



}
