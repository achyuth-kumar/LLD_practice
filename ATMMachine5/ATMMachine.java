public interface ATMMachine {
    public void credit(Integer accountId,Integer amount);
    public void debit(Integer accountId,Integer amount);
    public void viewBalance();
}
