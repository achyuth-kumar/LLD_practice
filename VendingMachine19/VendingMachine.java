public interface VendingMachine {
    public void pleaseInsertCoin(Coin coin);
    public void chooseProduct(Item item);
    public boolean validateProduct(Coin coin, Item item);
    public void dispenseItem(Item item);
}
