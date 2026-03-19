public class Test {
    public static void main(String[] args) {
        Student[] students = {new Student("Louis", "Nguyen", 147831, 3.90), new Student("John",
                "Doe", 231798, 3.72)};

        System.out.println(students[0].compareTo(students[1]));

        Circle[] circles = {new Circle(5), new Circle(5)};

        System.out.println(circles[0].compareTo(circles[1]));
    }
}
