package strategy;

public class StrategyDemo {
    public static void execute(Strategy strategy) {
        strategy.solve();
    }

    public static void main(String[] args) {
        Strategy[]algorithms={new FOO(),new BAR()};
        for (Strategy algorthm:algorithms
             ) {
            execute(algorthm);
        }
    }
}
