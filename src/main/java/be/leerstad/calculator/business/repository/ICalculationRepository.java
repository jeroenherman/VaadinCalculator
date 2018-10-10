package be.leerstad.calculator.business.repository;

import be.leerstad.calculator.business.Calculation;

import java.util.List;

public interface ICalculationRepository extends IRepository<Calculation> {
    public List<Calculation> getAll();

}
