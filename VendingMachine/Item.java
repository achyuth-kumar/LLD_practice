public enum Item {
    PEPSI("PEPSI"),
    COKE("COKE"),
    SPRITE("SPRITE");
    String value;
    Item(String value) {
        this.value=value;
    }
    public String getValue() {
        return this.value;
    }
};
