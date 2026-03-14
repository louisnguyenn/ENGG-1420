public class Person {
    private String name;
    private String lastName;
    private String nationalCode;

    public Person(String name, String lastName, String nationalCode) {
        setName(name);
        setLastName(lastName);
        setNationalCode(nationalCode);
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getNationalCode() {
        return this.nationalCode;
    }
}
