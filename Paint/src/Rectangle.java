import java.util.ArrayList;
import java.util.Objects;

public class Rectangle {
    ArrayList<Double> sides;
    public Rectangle(double width, double height) {
        sides = new ArrayList<>();
        sides.add(width);
        sides.add(height);
    }
    public ArrayList<Double> getSides() {
        return sides;
    }
    public boolean isSquare() {
        return sides.get(0).equals(sides.get(1));
    }
    public double calculatePerimetre() {
        return 2 * (sides.get(0) + sides.get(1));
    }
    public double calculateArea() {
        return sides.get(0) * sides.get(1);
    }
    public void draw() {
        System.out.println("Rectangle: Perimetre: " + calculatePerimetre() + ", Area: " + calculateArea());
    }

    @Override
    public boolean equals(Object other) {
        if(this == other)
            return true;
        if(!(other instanceof Rectangle))
            return false;
        Rectangle secondary = (Rectangle) other;
        return sides.get(0).equals(secondary.sides.get(0))
                && sides.get(1).equals(secondary.sides.get(1))
                ||
                sides.get(1).equals(secondary.sides.get(0))
                        && sides.get(0).equals(secondary.sides.get(1));
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    @Override
    public String toString() {
        return "Rectangle; Sides: " + sides.get(0) + " " + sides.get(1);
    }
}
