public interface Customer {
    public void credit(Integer accountno,Integer amount);
    public void debit(Integer accountno,Integer amount);
    public void viewBalance(Integer accountno);
}
