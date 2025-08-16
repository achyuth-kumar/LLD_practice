public class WeightAdaptee extends WeightAdapterImpl{
    public WeightAdaptee(int weight) {
        super(weight);
    }
    public void getWeightInKgs() {
        System.out.println("Weight in Kg's : "+super.logic());
    }
}
