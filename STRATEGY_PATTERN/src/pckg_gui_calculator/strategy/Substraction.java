package pckg_gui_calculator.strategy;

public class Substraction implements CalculationStrategy {

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public String toString() {
        return "Substraction";
    }
}
