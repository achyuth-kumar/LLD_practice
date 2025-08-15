import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<FileSystem> fileSystemList=new ArrayList<>();
        FileSystem file1 = new File("Achyuth");
        FileSystem file2 = new File("Kumar");
        fileSystemList.add(file1);
        fileSystemList.add(file2);
        Directory directory=new Directory("Root",fileSystemList);
        directory.ls();

    }
}
