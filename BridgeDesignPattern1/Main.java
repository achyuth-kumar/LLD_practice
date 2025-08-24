public class Main {
    public static void main(String [] args) {
        LivingThings dog=new Dog(new AirBreatheImpl());
        dog.breatheProcess();

        LivingThings fish=new Fish(new WaterBreatheImpl());
        fish.breatheProcess();
    }
}
