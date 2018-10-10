package be.leerstad.calculator.service.dto;

public class CalculationDTO {
    private String number1;
    private String number2;
    private String operation;
    private String result;

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return number1 + " " + operation + " " + number2 + " = " + result;
    }

}
