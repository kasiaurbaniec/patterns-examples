package builder;

public class Main {
    public static void main(String[] args) {


    Person person=Person.PersonBuilder
            .aPerson("5345343")
            .withAddress("Gorzka")
            .withName("Kasia")
            .withLName("PArral")
            .build();
    Person person1=Person.PersonBuilder
            .aPerson("645645")
            .withAddress("Horendalna")
            .withName("Basia")
            .withLName("Kowalska")
            .build();
    Person person2=Person.PersonBuilder
            .aPerson("645758")
            .withName("Zygmunt")
            .build();

        System.out.println(person.toString());
        System.out.println(person1.toString());
        System.out.println(person2.toString());
}}
