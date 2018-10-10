package be.leerstad.calculator.frontend;

import be.leerstad.calculator.frontend.controller.CalculateListener;
import be.leerstad.calculator.service.Operation;
import be.leerstad.calculator.service.manager.CalculatorManager;
import com.vaadin.ui.*;


import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

public class InputPanel extends VerticalLayout implements Observer {

    private CalculatorManager manager;
    private TextField input1;
    private TextField input2;
    private ComboBox ops;

    public InputPanel(CalculatorManager manager) {
        this.manager = manager;
        init();
    }

    private void init() {
        manager.addObserver(this);
        createInput();
        createButton();
    }

    private void createInput() {
        input1 = new TextField("Number 1");
        input2 = new TextField("Number 2");
        ops = new ComboBox("Operation", Arrays.asList(Operation.values()));

        HorizontalLayout layout = new HorizontalLayout();
        layout.setMargin(true);
        layout.addComponent(input1);
        layout.addComponent(ops);
        layout.addComponent(input2);

        addComponent(layout);
    }
    private void createButton() {
        Button btn = new Button("Calculate", new CalculateListener(this, manager));
        addComponent(btn);
    }

    @Override
    public void update(Observable o, Object arg) {
        input1.clear();
        input2.clear();
        ops.clear();
    }

    public TextField getInput1() {
        return input1;
    }

    public TextField getInput2() {
        return input2;
    }

    public ComboBox getOps() {
        return ops;
    }
}
