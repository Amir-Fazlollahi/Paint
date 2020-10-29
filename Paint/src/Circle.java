import java.util.Objects;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double calculatePerimetre() {
        return 2 * Math.PI * radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public void draw() {
        System.out.println("Circle: Perimetre: " + calculatePerimetre() + ", Area: " + calculateArea());
    }

    @Override
    public boolean equals(Object other) {
        if(this == other)
            return true;
        if(!(other instanceof Circle)) {
            return false;
        }
        Circle secondary = (Circle) other;
        return radius == secondary.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle; Radius: " + radius;
    }
}
