public class Main {
    public static void main(String [] args) {
        VersionControlServiceImpl git=new VersionControlServiceImpl();
        git.AddKey(1,10);
        git.AddKey(1,20);
        git.AddKey(1,30);
        git.GetValue(1,1);
//        git.DisplayValues();
    }

}
