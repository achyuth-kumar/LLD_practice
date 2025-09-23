public interface States {
    public void InsertCoin(Integer amount,Item item);
    public void ChooseProduct(Integer amount,Item item);
    public void validateProduct(Integer amount,Item item);
    public void DispenseProduct(Item item);
}
