public enum Coin {
    FIVE(5),
    TEN(10),
    TWENTY(20);
    public Integer value;
    Coin(Integer value) {
        this.value=value;
    }
    public Integer getValue() {
        return this.value;
    }
};
