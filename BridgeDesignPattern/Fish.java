public class Fish extends LivingThings{

    Fish(BreatheImpl breatheImpl) {
        super(breatheImpl);
    }

    @Override
    public void breatheProcess() {
        breatheImpl.breathe();
    }
}
