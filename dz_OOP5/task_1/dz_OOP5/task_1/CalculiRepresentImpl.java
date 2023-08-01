package dz_OOP5.task_1;

import java.io.*;

public class CalculiRepresentImpl implements CalculatorRepresent {
    private CalculiInputView inputView;
    private CalculiOutputView outputView;
    private CalculiModel model;

    public CalculiRepresentImpl(CalculiInputView inputView, CalculiOutputView outputView, CalculiModel model) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.model = model;
    }

    @Override
    public void calculate() {
        double firstNumber = inputView.getFirstNumber();
        double secondNumber = inputView.getSecondNumber();
        char operation = inputView.getOperation();

        double result = model.performOperation(firstNumber, secondNumber, operation);

        outputView.showResult(result);
    }
}
