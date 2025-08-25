public class Page implements  Tools{
    int noOfPages;
    String content;
    Page(int n,String content) {
        this.noOfPages=n;
        this.content=content;
    }

    public Page() {

    }

    public void openPage() {
        System.out.println("page content : "+ this.content);
    }

    @Override
    public void insertWordArt() {
        System.out.println("Insert Word Art");
    }

    @Override
    public void insertSquare() {
        System.out.println("Insert Square");
    }

    @Override
    public void insertCircle() {
        System.out.println("Insert Circle");
    }
}
