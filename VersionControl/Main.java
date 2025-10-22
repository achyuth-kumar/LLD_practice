public class Main {
    public static void main(String [] args) {
        VersionControl git=new VersionControlImpl();
        git.put(0,10);
        git.put(0,20);
        git.put(0,30);


        git.put(1,100);
        git.put(1,200);
        git.put(1,300);

        git.getValueAtVersion(1,2);

    }

}
