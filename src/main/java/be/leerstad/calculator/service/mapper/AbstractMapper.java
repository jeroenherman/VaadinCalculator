package be.leerstad.calculator.service.mapper;

import be.leerstad.calculator.business.Calculation;
import be.leerstad.calculator.service.dto.CalculationDTO;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractMapper<D,B> implements IMapper<D, B> {
	
	@Override
	public List<D> mapToDTO(List<B> bs) {
		if(bs == null)
			return null;
		
		return bs.stream().map(b -> mapToDTO(b)).collect(Collectors.toList());
				
//		List<D> ds = new ArrayList<D>();
//		for(B b : bs) {
//			ds.add(mapToDTO(b));
//		}
//		return ds;
	}
	
	@Override
	public List<B> mapToObj(List<D> ds) {
		if(ds == null)
			return null;
		
		return ds.stream().map(d -> mapToObj(d)).collect(Collectors.toList());
	}

}
