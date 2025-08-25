public class FileFactory {
    public File getFileFactory(String input) {
        if(input.equals("oldfile")) {
            return new oldFile();
        }
        else if(input.equals("newfile")) {
            return new newFile();
        }
        return null;
    }
}
