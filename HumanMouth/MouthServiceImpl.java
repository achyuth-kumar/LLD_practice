public class MouthServiceImpl implements Mouth{

    boolean open;
    Integer Capacity;
    public MouthServiceImpl(Integer capacity) {
        this.open = false;
        this.Capacity = capacity;
    }
    @Override
    public void OpenMouth() {
        this.open=true;
        System.out.println("Mouth is opened");
    }

    @Override
    public void CloseMouth() {
        this.open=false;
        System.out.println("Mouth is closed");
    }

    @Override
    public boolean getAvailability(Integer CurrentFood) {
        return CurrentFood<Capacity;
    }

    @Override
    public void ChewFood(Integer CurrentFood) {
        if(this.open) {
            if (getAvailability(CurrentFood)) {
                System.out.println("Processing the Current Food : " + CurrentFood);
            } else {
                System.out.println("Exhausted with the current limit");
            }
        }
        else {
            System.out.println("Mouth should be open to accept food");
        }
    }

    @Override
    public void DrinkWater() {
        System.out.println("Drinking Water");
    }
}
