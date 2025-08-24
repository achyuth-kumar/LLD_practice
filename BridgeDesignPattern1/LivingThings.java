public abstract class LivingThings {
    BreatheImpl breatheImpl;
    LivingThings(BreatheImpl breatheImpl) {
        this.breatheImpl=breatheImpl;
    }
    public abstract void breatheProcess();
}
