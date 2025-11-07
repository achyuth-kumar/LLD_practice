import java.util.HashMap;
import java.util.Map;

public class NotesServiveImpl implements Notes{
    Integer notesId=0;
    HashMap<Integer,String> notes=new HashMap<>();
    boolean OpenNotes=false;
    @Override
    public void OpenNotes() {
        this.OpenNotes=true;
    }

    @Override
    public void CloseNotes() {
        this.OpenNotes=false;
    }

    @Override
    public void PinNotes(User user,Integer NotesId) {
        if(this.OpenNotes) {
            if (user.getAccess() == Access.WRITE) {
                System.out.println(notes.get(NotesId) + " : Notes Pinned");
            } else {
                System.out.println(user.getName() + " is not having write access");
            }
        }
        else {
            System.out.println("Notes is closed , please open it");
        }
    }

    @Override
    public void AddNotes(User user,Integer NotesId,String message) {
        if(this.OpenNotes) {
            if (user.getAccess() == Access.WRITE) {
                notes.put(NotesId, message);
            } else {
                System.out.println(user.getName() + " is not having write access");
            }
        }
        else {
            System.out.println("Notes is closed , please open it");
        }
    }

    @Override
    public void DeleteNotes(User user,Integer NotesId) {
        if(this.OpenNotes) {
            if (user.getAccess() == Access.WRITE) {
                notes.remove(NotesId);
            } else {
                System.out.println(user.getName() + " is not having write access");
            }
        }
        else {
            System.out.println("Notes is closed , please open it");
        }
    }

    @Override
    public void DisplayNotes(User user) {
        if(this.OpenNotes) {
            if (user.getAccess() ==Access.READ || user.getAccess()==Access.WRITE) {
                System.out.println("All Notes");
                for (Map.Entry<Integer, String> entry : notes.entrySet()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
            } else {
                System.out.println(user.getName() + " is not having access");
            }
        }
        else {
            System.out.println("Notes is closed , please open it");
        }
    }
}
