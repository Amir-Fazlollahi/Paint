import java.util.ArrayList;
import java.util.Objects;

public class Triangle {
    ArrayList<Double> sides;
    public Triangle(double side1, double side2, double side3) {
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }
    public ArrayList<Double> getSides() {
        return sides;
    }
    public boolean isEquilateral() {
        return sides.get(0).equals(sides.get(1))
                && sides.get(1).equals(sides.get(2));
    }
    public double calculatePerimetre() {
        return sides.get(0) + sides.get(1) + sides.get(2);
    }
    public double calculateArea() {
        double a = sides.get(0), b = sides.get(1), c = sides.get(2);
        double cosineOfTheta = -(c * c - a * a - b * b) / (2 * a * b);
        return a * b * Math.sqrt(1 - cosineOfTheta * cosineOfTheta) / 2;
    }
    public void draw() {
        System.out.println("Triangle: Perimetre: " + calculatePerimetre() + ", Area: " + calculateArea());
    }
    public boolean equals(Object other) {
        if(this == other)
            return true;
        if(!(other instanceof Triangle))
            return false;
        Triangle secondary = (Triangle) other;
        return sides.get(0).equals(secondary.sides.get(0))
                && sides.get(1).equals(secondary.sides.get(1))
                && sides.get(2).equals(secondary.sides.get(2))
                ||
                sides.get(0).equals(secondary.sides.get(0))
                        && sides.get(1).equals(secondary.sides.get(2))
                        && sides.get(2).equals(secondary.sides.get(1))
                ||
                sides.get(0).equals(secondary.sides.get(1))
                        && sides.get(1).equals(secondary.sides.get(0))
                        && sides.get(2).equals(secondary.sides.get(2))
                ||
                sides.get(0).equals(secondary.sides.get(1))
                        && sides.get(1).equals(secondary.sides.get(2))
                        && sides.get(2).equals(secondary.sides.get(0))
                ||
                sides.get(0).equals(secondary.sides.get(2))
                        && sides.get(1).equals(secondary.sides.get(1))
                        && sides.get(2).equals(secondary.sides.get(0))
                ||
                sides.get(0).equals(secondary.sides.get(2))
                        && sides.get(1).equals(secondary.sides.get(0))
                        && sides.get(2).equals(secondary.sides.get(1));
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }

    @Override
    public String toString() {
        return "Triangle; Sides: " + sides.get(0) + " " + sides.get(1) + " " + sides.get(2);
    }
}
