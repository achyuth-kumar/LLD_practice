public class User {
    public Integer id;
    public String name;
    public Access access;
    public NotesServiveImpl notesServive;
    public User(Integer id, String name, Access access,NotesServiveImpl notesServive) {
        this.id = id;
        this.name = name;
        this.access = access;
        this.notesServive=notesServive;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public void OpenNotes() {
        notesServive.OpenNotes();
    }
    public void CloseNotes() {
        notesServive.CloseNotes();
    }
    public void PinNotes(Integer NotesId) {
        notesServive.PinNotes(this,NotesId);
    }
    public void AddNotes(Integer NotesId,String message) {
        notesServive.AddNotes(this,NotesId,message);
    }

    public void DeleteNotes(Integer NotesId) {
        notesServive.DeleteNotes(this,NotesId);
    }
    public void DisplayNotes() {
        notesServive.DisplayNotes(this);
    }



}
