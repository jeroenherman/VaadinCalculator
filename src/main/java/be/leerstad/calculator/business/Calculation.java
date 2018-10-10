package be.leerstad.calculator.business;

import be.leerstad.calculator.business.getalimpl.Result;
import be.leerstad.calculator.business.getalimpl.Term1;
import be.leerstad.calculator.business.getalimpl.Term2;
import be.leerstad.calculator.service.Operation;

public class Calculation {
    private Term1 term1;
    private Term2 term2;
    private Result result;
    private Operation operation;

    public Term1 getTerm1() {
        return term1;
    }

    public void setTerm1(Term1 term1) {
        this.term1 = term1;
    }

    public Term2 getTerm2() {
        return term2;
    }

    public void setTerm2(Term2 term2) {
        this.term2 = term2;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
