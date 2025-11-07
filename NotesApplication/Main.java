public class Main {
    public static void main(String [] args) {
        User user=new User(1,"Achyuth",Access.WRITE,new NotesServiveImpl());
        user.OpenNotes();
        user.AddNotes(1,"Welcome to C++");
        user.AddNotes(2,"Welcome to JAva");
        user.AddNotes(3,"Welcome to Python");
        user.DisplayNotes();
        user.DeleteNotes(2);
        user.DisplayNotes();
    }
}
