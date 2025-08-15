import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    public String directoryName;
    List<FileSystem> fileSystemList=new ArrayList<>();
    public Directory(String directoryName,List<FileSystem> fileSystemList) {
        this.directoryName=directoryName;
        this.fileSystemList=fileSystemList;
    }
    @Override
    public void ls() {
        System.out.println("directory name : "+this.directoryName);
        for(FileSystem fileSystem : fileSystemList) {
            fileSystem.ls();
        }
    }
}

