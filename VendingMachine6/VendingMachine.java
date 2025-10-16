public interface VendingMachine {
    public void InsertCoin(Coin coin);
    public void ChooseProduct(Item item);
    public boolean ValidateProduct(Coin coin,Item item);
    public void DispenseItem(Item item);
}
