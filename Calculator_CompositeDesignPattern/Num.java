public class Num implements ArthematicExpession{
    public int n;
    Num(int n) {
        this.n=n;
    }

    @Override
    public int evavluate() {
        return this.n;
    }
}
