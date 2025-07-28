public class SingleTon {
    public static SingleTon newInstance = null;
    SingleTon() {
    }
    public static SingleTon getSingleTonObject() {
        if(newInstance==null) {
            newInstance = new SingleTon();
        }
        return newInstance;
    }

}