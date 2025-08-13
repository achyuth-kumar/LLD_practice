public interface State {
    public void idleState();
    public void enterCoin(int coin);
    public void dispenseItem(String item);
}
