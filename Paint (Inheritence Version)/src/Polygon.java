import java.util.ArrayList;

public class Polygon extends Shape{

    protected ArrayList<Double> sides;

    public Polygon(double[] args) {
        sides = new ArrayList<>();
        for (Double side:
             args) {
            sides.add(side);
        }
    }

    public ArrayList<Double> getSides() {
        return sides;
    }
    @Override
    public double calculatePerimetre() {
        double perimetre = 0;
        for (Double side:
             sides) {
            perimetre += side;
        }
        return perimetre;
    }
    @Override
    public double calculateArea() {
        return super.calculateArea();
    }
    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public boolean equals(Object other) {
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
