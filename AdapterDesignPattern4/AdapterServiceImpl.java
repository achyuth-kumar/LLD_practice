public class AdapterServiceImpl implements Adapter{

    public Adaptee adaptee;

    public AdapterServiceImpl(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public Integer getWeightInPonds(Integer Weight) {
        return adaptee.getWeightInPonds(Weight);
    }
}
