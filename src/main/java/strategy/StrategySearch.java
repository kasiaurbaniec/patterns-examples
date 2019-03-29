package strategy;

abstract class StrategySearch implements Strategy{
   abstract void preProcess();
   abstract void postProcess();
   abstract boolean search();

    public void solve() {
        while (true){
            preProcess();
        if(search()){
            break;
        }postProcess();
        }

    }
}
