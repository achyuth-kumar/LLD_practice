public class Main {
    public static void main(String[] args) {
        VersionControl git=new VersionControlImpl();
        git.put(1,10);
        git.put(1,20);
        git.put(1,30);
        git.put(1,40);

        git.get(1,3);
    }
}
