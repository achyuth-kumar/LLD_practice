public enum Item {
    PEPSI("pepsi"),
    COKE("coke"),
    SPRITE("sprite");
    public String value;
    Item(String value) {
        this.value=value;
    }
    public String getValue() {
        return this.value;
    }
}
