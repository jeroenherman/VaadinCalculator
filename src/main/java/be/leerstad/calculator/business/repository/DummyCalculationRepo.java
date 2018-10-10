package be.leerstad.calculator.business.repository;

import be.leerstad.calculator.business.Calculation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DummyCalculationRepo implements ICalculationRepository {
  private List<Calculation> myCalculations;

  public DummyCalculationRepo() {
    myCalculations = new ArrayList<>();
  }

  @Override
  public boolean add(Calculation calculation) {
    myCalculations.add(calculation);
    return true;
  }

  @Override
  public boolean remove(Calculation calculation) {
    myCalculations.remove(calculation);
    return true;
  }

  @Override
  public Calculation getByID(int id) {
    return myCalculations.get(id);
  }

  @Override
  public List<Calculation> getAll() {
    // DO NOT OPEN THE GATES OF MORDOR!!
    // use Collections.unmodifiableXXX to disable bypassing the add/remove methods
    return Collections.unmodifiableList(myCalculations);
  }

}
