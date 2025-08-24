public class Main {
    public static void main(String [] args) {
        BreatheImpl breatheImpl=new AirBreatheImpl();
        LivingThings dog=new Dog(breatheImpl);
        dog.breatheProcess();

        breatheImpl=new WaterBreatheImpl();
        LivingThings fish=new Fish(breatheImpl);
        fish.breatheProcess();
    }
}
