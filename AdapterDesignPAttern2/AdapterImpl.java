public class AdapterImpl implements  Adapter{
    public Adaptee adaptee;
    public AdapterImpl(Adaptee adaptee) {
        this.adaptee=adaptee;
    }
    @Override
    public double getWeightInKgs(int weight) {
        return adaptee.getWeightInKgs(weight);
    }
}
