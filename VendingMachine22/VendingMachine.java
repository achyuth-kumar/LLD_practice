public interface VendingMachine {
    public void pleaseInsertCoin(Coin coin,Item item);
    public void chooseProduct(Coin coin,Item item);
    public boolean validateProduct(Coin coin,Item item);
    public void dispenseItem(Item item);
}
