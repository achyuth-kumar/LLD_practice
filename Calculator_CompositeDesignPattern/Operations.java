public enum Operations {
    ADD("ADD"),
    SUB("SUB"),
    MUL("MUL"),
    DIV("DIV");
    public String value;
    Operations(String value) {
        this.value=value;
    }
    public String getValue() {
        return this.value;
    }
};
