import java.util.Objects;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimetre() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public void draw() {
        super.draw();
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
        return "Circle; Radius: " + getRadius();
    }
}
