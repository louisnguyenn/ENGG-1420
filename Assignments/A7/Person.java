public class Person {
    private String name;
    private String lastName;
    private String nationalCode;

    public Person() {
    }

    public Person(String name, String lastName, String nationalCode) {
        setName(name);
        setLastName(lastName);
        setNationalCode(nationalCode);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
