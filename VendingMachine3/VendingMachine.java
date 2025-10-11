public interface VendingMachine {
    public void insertAndSelectProduct(Coin coin,Item item);
    public boolean validateProduct(Coin coin,Item item);
    public void dispenseItem(Item item);
}
