package be.leerstad.calculator.business.repository;

public interface IRepository <T> {
   boolean add(T aggregate);

  boolean remove(T aggregate);

  T getByID(int id);

}
