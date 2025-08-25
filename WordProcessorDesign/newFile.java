public class newFile extends Page implements  File{
    newFile() {

    }
    newFile(int n, String content) {
        super(n, content);
    }

    @Override
    public void insertWordArt() {
        super.insertWordArt();
    }

    @Override
    public void insertSquare() {
        super.insertSquare();
    }

    @Override
    public void insertCircle() {
        super.insertCircle();
    }
    @Override
    public void hasAccess(int id) {
        System.out.println(id+" : has access");
    }
}
