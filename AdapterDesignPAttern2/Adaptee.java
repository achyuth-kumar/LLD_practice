public class Adaptee implements Adapter{

    @Override
    public double getWeightInKgs(int weight) {
        return weight*0.45;
    }

}
