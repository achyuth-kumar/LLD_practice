public class Book {
    public String name;
    public int price;
    Book(String name,int price) {
        this.name=name;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
