package StrategyExample;

public class Test {
    int result=new Contex(new CalulateSum()).execute(3,5);
    int result2=new Contex(new CalculateSub()).execute(3,5);
}
