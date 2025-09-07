import java.awt.color.ICC_ColorSpace;

public class User {
    public int id;
    public String name;
    ElevatorSystem evelatorSystem;
    User(ElevatorSystem evelatorSystem) {
        this.evelatorSystem=evelatorSystem;
    }
    public UpSide upSide() {
        return evelatorSystem.upSide();
    }
    public DownSide downSide() {
        return evelatorSystem.downSide();
    }
}
