public class User {
    public Book getSlots(String input) {
        if(input.equals("politician")) {
            return new Politician();
        }
        return new NonPolitician();
    }
} 