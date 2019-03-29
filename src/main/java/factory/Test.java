package factory;

public class Test {
    public static void main(String[] args) {
        Computer pc=ComputerFactory.getComputer("pc","2GB", "300GB","2.4GHz");
        Computer sv=ComputerFactory.getComputer("server","2GB", "340GB","2.9GHz");

        System.out.println(pc);
        System.out.println(sv);

    }
}
