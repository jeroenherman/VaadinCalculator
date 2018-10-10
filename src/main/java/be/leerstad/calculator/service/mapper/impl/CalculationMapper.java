package be.leerstad.calculator.service.mapper.impl;

import be.leerstad.calculator.business.Calculation;
import be.leerstad.calculator.service.dto.CalculationDTO;

import be.leerstad.calculator.service.mapper.AbstractMapper;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CalculationMapper extends AbstractMapper<CalculationDTO,Calculation> {


    @Override
    public CalculationDTO mapToDTO(Calculation calculation) {
        if (calculation ==null)
            return null;
        CalculationDTO dto = new CalculationDTO();
        dto.setNumber1(Integer.toString(calculation.getTerm1().getGetal()));
        dto.setNumber2(Integer.toString(calculation.getTerm2().getGetal()));
        dto.setOperation(calculation.getOperation().toString());
        dto.setResult(Integer.toString(calculation.getResult().getGetal()));
        return dto;
    }

    @Override
    public Calculation mapToObj(CalculationDTO calculationDTO) {
        throw new NotImplementedException();
    }
}
