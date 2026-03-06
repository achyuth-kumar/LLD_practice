public class Player {
    Integer id;
    String name;
    Colour colour;


    public Player(Integer id,String name,  Colour colour) {
        this.name = name;
        this.id = id;
        this.colour = colour;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }




}
