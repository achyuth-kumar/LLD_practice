public class Food {

    public Integer foodId;
    public String name;

    public Food(Integer foodId, String name) {
        this.foodId = foodId;
        this.name = name;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public String getName() {
        return name;
    }
}
