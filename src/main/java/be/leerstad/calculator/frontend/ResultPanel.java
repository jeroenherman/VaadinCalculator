package be.leerstad.calculator.frontend;

import be.leerstad.calculator.service.dto.CalculationDTO;
import be.leerstad.calculator.service.manager.CalculatorManager;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ResultPanel extends VerticalLayout implements Observer {

    private CalculatorManager manager;
    private VerticalLayout verticalLayoutResults;
    public ResultPanel(CalculatorManager manager) {
        this.manager = manager;
        manager.addObserver(this);
        verticalLayoutResults = new VerticalLayout();
        addComponent(verticalLayoutResults);
    }



    @Override
    public void update(Observable o, Object arg) {
        verticalLayoutResults.removeAllComponents();
        // method update takes Observable Object Cast this object back to the Object you are observing.
        List<CalculationDTO> calculationDTOList = ((CalculatorManager)o).getResults();
        // Meer uitleg over deze lambda nodig !!!
        calculationDTOList.stream().forEach(r -> verticalLayoutResults.addComponent(new Label(r.toString())));
    }
}
