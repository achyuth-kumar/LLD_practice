public class Main {
    public static void main(String [] args) {
        VersionControl git=new VersionControlImpl();
        git.put(0,10);
        git.put(0,20);
        git.put(0,30);

        git.get(0,2);
    }
}