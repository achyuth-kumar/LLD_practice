public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth");
        user.createUser();
        FileFactory fileFactory =new FileFactory();
        oldFile file= (oldFile) fileFactory.getFileFactory("oldfile");
        file.insertWordArt();
    }
}
