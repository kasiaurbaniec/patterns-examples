package StrategyExample;

public class Contex {
     private CalculationStrategy calculationMethod;

    public Contex(CalculationStrategy calculationMethod) {
        this.calculationMethod = calculationMethod;
    }
    public int execute(int a, int b){
        return calculationMethod.calculate(a,b);
    }
}
