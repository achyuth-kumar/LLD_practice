public class WeightAdapterImpl implements WeightAdapter{
    public int weight;
    public WeightAdapterImpl(int weight) {
        this.weight=weight;
    }
    @Override
    public double logic() {
        return this.weight*0.45;
    }
}
