public class Main {
    public static void main(String args[]) {
        MyHashMap mpp=new MyHashMap();
        mpp.put(1,10);
        mpp.put(2,20);
        System.out.println("--------Before change------------");
        System.out.println(mpp.get(1));
        System.out.println(mpp.get(2));
        System.out.println(mpp.get(3));
        mpp.put(1,150);
        System.out.println("--------After change------------");
        System.out.println(mpp.get(1));
        System.out.println(mpp.get(2));
        System.out.println(mpp.get(3));
    }
}