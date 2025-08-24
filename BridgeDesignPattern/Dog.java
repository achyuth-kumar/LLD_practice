public class Dog extends LivingThings{

    Dog(BreatheImpl breatheImpl) {
        super(breatheImpl);
    }

    @Override
    public void breatheProcess() {
        breatheImpl.breathe();
    }
}
