package StaticMethod;

public class Main {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(1 , "Jame");
        Student s2 = new Student(2, "John");
        Student s3 = new Student(3, "Jerry");

        s1.display();
        s2.display();
        s3.display();
    }
}
