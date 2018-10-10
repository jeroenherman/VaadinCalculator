package be.leerstad.calculator.service.mapper;

import java.util.List;

public interface IMapper<D, B> {

	public D mapToDTO(B b);

	public B mapToObj(D d);

	public List<D> mapToDTO(List<B> b);

	public List<B> mapToObj(List<D> d);

}
