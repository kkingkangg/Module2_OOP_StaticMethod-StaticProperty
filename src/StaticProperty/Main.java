package StaticProperty;

public class Main {
    public static void main(String[] args) {
    Car car1 = new Car("Audi", "Q7");
        System.out.println(Car.number);
    Car car2 = new Car("BMW", "I8");
        System.out.println(Car.number);
    }
}
