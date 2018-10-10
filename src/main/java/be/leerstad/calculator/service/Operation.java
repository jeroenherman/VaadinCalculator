package be.leerstad.calculator.service;

public enum Operation {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String value;
    Operation(String value) {
        this.value = value;
    }

    @Override
    public String toString() {

        return value;
    }
}
