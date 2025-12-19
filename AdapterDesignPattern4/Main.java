public class Main {
    public static void main(String [] args) {
        Adapter adapter=new AdapterServiceImpl(new Adaptee());
        System.out.println("Weight in ponds : "+adapter.getWeightInPonds(5));
    }
}
