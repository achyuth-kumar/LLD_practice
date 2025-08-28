public class Book {
    int price;
    String name;
    Book(int price,String name) {
        this.price=price;
        this.name=name;
    }
    public int getPrice() {
        return this.price;
    }
    public String getName() {
        return this.name;
    }
}
