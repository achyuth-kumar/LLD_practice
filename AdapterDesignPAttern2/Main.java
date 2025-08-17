public class Main {
    public static void main(String [] args) {
        Adapter adapter=new AdapterImpl(new Adaptee());
        System.out.println("Weight in kgs : "+adapter.getWeightInKgs(3));
    }
}
