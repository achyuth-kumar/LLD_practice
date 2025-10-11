public class StateImpl implements State {
    boolean status=false;
    StateImpl(boolean status) {
        this.status=status;
    }
    @Override
    public boolean getStatus() {
        return status;
    }

    
}
