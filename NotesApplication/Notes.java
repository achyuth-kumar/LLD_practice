public interface Notes {
    public void OpenNotes();
    public void CloseNotes();
    public void PinNotes(User user,Integer NotesId);
    public void AddNotes(User user,Integer NotesId,String message);
    public void DeleteNotes(User user,Integer NotesId);
    public void DisplayNotes(User user);
}

