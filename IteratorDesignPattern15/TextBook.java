public class TextBook {
    Integer ID;
    String name;

    public TextBook(Integer ID, String name) {
        this.ID = ID;
        this.name = name;
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
