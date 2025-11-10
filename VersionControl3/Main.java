public class Main {
    public static void main(String [] args) {
        VersionControlServiceImpl git=new VersionControlServiceImpl();
        git.AddKey(1,10);
        git.AddKey(1,20);
        git.AddKey(1,30);
        git.AddKey(1,40);
        git.AddKey(1,50);
        git.AddKey(1,60);
        git.GetValue(1,1);
    }

}
