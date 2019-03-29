package builder;

public class Person {
    private String name;
    private String lName;
    private String pesel;
    private String address;

    private Person(String pesel) {
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getLName() {
        return lName;
    }

    public String getPesel() {
        return pesel;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static class PersonBuilder {
        private String name;
        private String lName;
        private String pesel;
        private String address;

        private PersonBuilder(String pesel) {
            this.pesel = pesel;
        }

        public static PersonBuilder aPerson(String pesel) {
            return new PersonBuilder(pesel);
        }

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder withLName(String lName) {
            this.lName = lName;
            return this;
        }

        public PersonBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            Person person = new Person(pesel);
            person.setName(name);
            person.setLName(lName);
            person.setAddress(address);
            return person;
        }
    }
}
