public interface VendingMachine {
    public void insertCoin(Coin coin);
    public void chooseProduct(Item item);
    public boolean validateProdcut(Coin coin, Item item);
    public void dispenseItem(Item item);
}
