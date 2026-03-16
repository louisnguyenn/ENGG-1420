public class Student implements Comparable {
    private String name;
    private String lastName;
    private int studentNumber;
    private double gpa;

    // constructor
    public Student(String name, String lastName, int studentNumber, double gpa) {
        setName(name);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setGpa(gpa);
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public double getGpa() {
        return this.gpa;
    }

    // methods
    public int compareTo(Object object) {
        int res = 0;

        if (object instanceof Student) {
            Student student = (Student) object; // cast the object to student class

            if (this.name.equalsIgnoreCase(student.getName())
                    && this.lastName.equalsIgnoreCase(student.getLastName())
                    && this.studentNumber == student.getStudentNumber()
                    && this.gpa == student.getGpa()) {
                return res;
            } else {
                if (this.gpa > student.getGpa()) {
                    res = 1;
                } else {
                    res = -1;
                }
            }
        }

        return res;
    }
}
