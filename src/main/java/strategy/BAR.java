package strategy;
@SuppressWarnings("ALL")
public class BAR extends StrategySearch{
private int state=1;
    void preProcess() {
        System.out.println("PreProcess ");
    }

    void postProcess() {
        System.out.println("PostProcess ");
    }

    boolean search() {
        System.out.println("Search-"+state++ +" ");
        return state==3?true:false;
    }
}
