public class Main {
    public static  void main(String [] args) {
        SnapCache cache=new SnapCache();
        cache.SetValue(0,10);
        cache.SetValue(0,20);


        cache.SetValue(1,100);
        cache.SetValue(1,200);
        cache.SetValue(1,300);
        cache.SetValue(1,400);

        cache.GetValue(1,3);

    }
}
