public class Main {
    public static void main(String [] args) {
        User user = new User();
        Book politician=user.getSlots("politician");
        politician.availeSlot("2-8-2000");
        politician.selectSlot();
        System.out.println();
        politician=user.getSlots("nonpolitician");
        politician.availeSlot("2-8-2000");
        politician.selectSlot();

    }
}