package be.leerstad.calculator.service.mapper.impl;

import be.leerstad.calculator.business.Calculation;
import be.leerstad.calculator.business.getalimpl.Term1;
import be.leerstad.calculator.business.getalimpl.Term2;
import be.leerstad.calculator.service.dto.InputDTO;

import be.leerstad.calculator.service.mapper.AbstractMapper;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class InputMapper extends AbstractMapper<InputDTO, Calculation> {


    @Override
    public InputDTO mapToDTO(Calculation calculation) {
        throw new NotImplementedException();
    }

    @Override
        public Calculation mapToObj(InputDTO inputDTO) {
            Calculation calculation = new Calculation();
            calculation.setTerm1(new Term1(Integer.parseInt(inputDTO.getNbr1())));
            calculation.setTerm2(new Term2(Integer.parseInt(inputDTO.getNbr2())));
            // operation is not set
            return calculation;
    }
}
