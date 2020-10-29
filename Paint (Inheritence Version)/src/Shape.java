public class Shape {

    public double calculatePerimetre() {
        return 0;
    }
    public double calculateArea() {
        return 0;
    }
    public void draw() {
        System.out.println(this.getClass().getName() + "; Perimetre: " +
                calculatePerimetre() + ", Area: " + calculateArea());
    }
    public boolean equals(Object other) {
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "";
    }
}
