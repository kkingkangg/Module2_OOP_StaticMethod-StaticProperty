package StaticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String collage = "BBDIT";

    public Student(int r, String n) {
        this.rollno = r;
        this.name = n;
    }
    static void change () {
        collage = "CodeGym";
    }

    void display (){
        collage = "C0720I1";
        System.out.println(rollno + " " + name + " " + collage);
    }
}
