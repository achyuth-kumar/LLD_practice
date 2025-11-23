public class Main {
    public static void main(String [] args) {
        Git git=new GitServiceImpl();
        git.PutKey(1,"Apple"); //0
        git.PutKey(1,"Mango"); //1
        git.PutKey(1,"Orange"); // 2
        git.GetValue(1,1);

        git.PutKey(2,"Banana"); // 0
        git.PutKey(2,"Papayya"); // 1
        git.PutKey(2,"Grapes"); // 2
//        git.GetValue(2,2);
    }
}
