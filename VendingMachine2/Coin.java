public enum Coin {
    FIVE(5),
    TEN(10),
    TWENTY(20);
    public int value;
    Coin(int value) {
        this.value=value;
    }
    public int getValue() {
        return this.value;
    }
}

