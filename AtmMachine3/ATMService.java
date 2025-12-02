public interface ATMService {
    public void credit(int acountNo,int amount,Operations operations);
    public void debit(int acountNo,int amount);
    public void viewBalance(int acountNo);
}
