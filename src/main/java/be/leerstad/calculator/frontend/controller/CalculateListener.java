package be.leerstad.calculator.frontend.controller;

import be.leerstad.calculator.frontend.InputPanel;
import be.leerstad.calculator.service.Operation;
import be.leerstad.calculator.service.dto.InputDTO;
import be.leerstad.calculator.service.dto.OperationDTO;
import be.leerstad.calculator.service.manager.CalculatorManager;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;

public class CalculateListener implements ClickListener {
   private CalculatorManager manager;
   private  InputPanel inputPanel;

    public CalculateListener(InputPanel inputPanel, CalculatorManager manager) {
        this.inputPanel = inputPanel;
        this.manager = manager;
    }

    @Override
    public void buttonClick(Button.ClickEvent event) {
        InputDTO inputDTO = new InputDTO();
        OperationDTO operationDTO = new OperationDTO();
        // read textfield
        inputDTO.setNbr1(inputPanel.getInput1().getValue());
        inputDTO.setNbr2(inputPanel.getInput2().getValue());
        // read Combo Box cast Object from getValue to Enum Operation
        operationDTO.setOperation((Operation)inputPanel.getOps().getValue());
        // calculate value in manager
        manager.calc(inputDTO,operationDTO);
    }
}
