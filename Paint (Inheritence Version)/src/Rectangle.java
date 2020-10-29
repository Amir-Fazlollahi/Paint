import java.util.ArrayList;
import java.util.Objects;

public class Rectangle extends Polygon{

    public Rectangle(double[] args) {
        super(args);
    }

    @Override
    public ArrayList<Double> getSides() {
        return sides;
    }
    @Override
    public double calculatePerimetre() {
        return super.calculatePerimetre();
    }
    @Override
    public double calculateArea() {
        return sides.get(0) * sides.get(1);
    }
    @Override
    public void draw() {
        super.draw();
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
    public boolean isSquare() {
        return sides.get(0).equals(sides.get(1));
    }
}
