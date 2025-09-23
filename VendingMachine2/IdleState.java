public class IdleState implements States{

    @Override
    public void InsertCoin(Integer amount,Item item) {
        System.out.println("Vending machine is in Idle state");
    }

    @Override
    public void ChooseProduct(Integer amount, Item item) {
        System.out.println("Vending machine is in Idle state");

    }

    @Override
    public void validateProduct(Integer amount, Item item) {
        System.out.println("Vending machine is in Idle state");

    }

    @Override
    public void DispenseProduct(Item item) {
        System.out.println("Vending machine is in Idle state");

    }
}
