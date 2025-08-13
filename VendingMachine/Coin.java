public enum Coin {
    five(5),
    ten(10),
    fifteen(15);
    private final int value;
    Coin(int value) {
        this.value=value;
    }
    public int getValue() {
        return this.value;
    }
};
