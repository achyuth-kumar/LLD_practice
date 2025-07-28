public class Main {
    public static void main(String [] args) {
        SingleTon object1=SingleTon.getSingleTonObject();
        System.out.println(object1);
        
        SingleTon object2=SingleTon.getSingleTonObject();
        System.out.println(object2);
        
    }
}