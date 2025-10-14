public interface VendingMachine {
    public void InsertCoinAndChooseProduct(Coin coin,Item item);
    public void ValidateProduct(Coin coin,Item item);
    public void DispenseItem(Item item);
}
