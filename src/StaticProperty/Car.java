package StaticProperty;

public class Car {
    private String name;
    private String engine;

    public static int number;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        number++;
    }
}
