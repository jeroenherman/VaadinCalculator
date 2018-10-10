package be.leerstad.calculator.service.manager;

import be.leerstad.calculator.business.Calculation;
import be.leerstad.calculator.business.getalimpl.Result;
import be.leerstad.calculator.business.repository.DummyCalculationRepo;
import be.leerstad.calculator.business.repository.ICalculationRepository;
import be.leerstad.calculator.service.dto.CalculationDTO;
import be.leerstad.calculator.service.dto.InputDTO;
import be.leerstad.calculator.service.dto.OperationDTO;
import be.leerstad.calculator.service.mapper.impl.CalculationMapper;
import be.leerstad.calculator.service.mapper.impl.InputMapper;

import java.util.List;
import java.util.Observable;

public class CalculatorManager extends Observable {
    private InputMapper inputMapper;
    private CalculationMapper calculationMapper;
    private ICalculationRepository calculationRepo;

    public CalculatorManager() {
        inputMapper = new InputMapper();
        calculationMapper = new CalculationMapper();
        calculationRepo = new DummyCalculationRepo(); // replace with real one
    }

    public void calc(InputDTO in, OperationDTO op) {
        Calculation calculation = inputMapper.mapToObj(in);
        calculation.setOperation(op.getOperation());

        switch (op.getOperation()) {

            case ADD: calculation.setResult(new Result(calculation.getTerm1().getGetal()+calculation.getTerm2().getGetal())); break;
            case DIVIDE: calculation.setResult(new Result(calculation.getTerm1().getGetal()/calculation.getTerm2().getGetal())); break;
            case MULTIPLY: calculation.setResult(new Result(calculation.getTerm1().getGetal()*calculation.getTerm2().getGetal())); break;
            case SUBTRACT: calculation.setResult(new Result(calculation.getTerm1().getGetal()-calculation.getTerm2().getGetal())); break;

        }
        calculationRepo.add(calculation);

        setChanged();
        notifyObservers();
    }

    public  List<CalculationDTO> getResults() {
        List<CalculationDTO> results = calculationMapper.mapToDTO(calculationRepo.getAll());
        return  results;
    }
}
