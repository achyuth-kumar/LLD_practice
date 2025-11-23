import java.util.List;

public interface Git {
    public void PutKey(int id,String input);
    public void GetValue(int id,int versionNo);
    public void DisplayValues();
}
