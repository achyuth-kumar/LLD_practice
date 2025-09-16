public class Main {
    public static void main(String [] args) {
        Cache cache=new CacheImpl();
        cache.write(1,"Achyuth");
        cache.write(1,"Achyuth");
        cache.write(2,"Kumar");
        cache.write(2,"Kumar");
        cache.write(2,"Kumar");
        cache.write(3,"Ravi");
        cache.write(3,"Ravi");
        cache.write(3,"Ravi");
        cache.write(3,"Ravi");
        cache.write(4,"Kiran");
        cache.write(4,"Kiran");
        cache.write(4,"Kiran");
        cache.write(5,"Sneha");
        cache.write(5,"Sneha");
        cache.write(5,"Sneha");
        cache.write(5,"Sneha");
        cache.write(6,"Suma");

//        cache.write(3,"Ravi");
//        cache.write(3,"Ravi");
//        cache.write(4,"Kiran");
//        cache.write(4,"Kiran");
//        cache.write(4,"Kiran");
//        cache.write(4,"Kiran");
//        cache.write(5,"Sneha");
//        cache.write(6,"Suma");
//        cache.write(7,"Pooja");
        cache.display();
    }
}
