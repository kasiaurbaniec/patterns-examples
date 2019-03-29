package strategy;

public class FOO extends StrategySolution{
    private int state=1;
    void start() {
        System.out.println("start");
    }

    boolean nextTry() {
        System.out.println("NextTry-"+state++ +" ");
        return true;
    }

    boolean isSolution() {
        System.out.println("IsSolution-"+(state==3) +" ");
        return (state==3);
    }

    void stop() {
        System.out.println("Stop");
    }
}
