public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth",Access.WRITE);
        Document document=new Document(1,"Walmart Document","Walmart SDE-2 Interview",user);
        if(document.OpenDocument()) {
            document.UpdateDocument("Phonepe Document", "Phonepe SDE2 interview");
            document.CloseDocument();
        }
    }
}
