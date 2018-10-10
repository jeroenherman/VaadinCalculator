package be.leerstad.calculator;

import be.leerstad.calculator.service.Operation;
import be.leerstad.calculator.service.dto.InputDTO;
import be.leerstad.calculator.service.dto.OperationDTO;
import be.leerstad.calculator.service.manager.CalculatorManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Runner {

    public static void main(String[] args) throws IOException {
        CalculatorManager manager = new CalculatorManager();
        InputDTO inputDTO = new InputDTO();
        OperationDTO operationDTO = new OperationDTO();
        for (int i = 0; i <5 ; i++) {
            inputDTO.setNbr1(read());
            operationDTO.setOperation(Operation.valueOf(read()));
            inputDTO.setNbr2(read());
            manager.calc(inputDTO, operationDTO);
            System.out.println(manager.getResults());
        }
    }

    private static String read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

}
