package AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius(){
        return radius;
    }

    private double getArea() {
        double area = radius*radius*3.14;
        return area;
    }


}
