public class Main {
    public static void main(String[] args) {
        Paint paint = new Paint();
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        Rectangle rec1 = new Rectangle(new double[]{1, 4});
        Rectangle rec2 = new Rectangle(new double[]{8, 5});
        Rectangle rec3 = new Rectangle(new double[]{6, 6});
        Triangle tri1 = new Triangle(new double[]{2, 2, 2});
        Triangle tri2 = new Triangle(new double[]{4, 4, 6});
        paint.addShape(circle1);
        paint.addShape(circle2);
        paint.addShape(rec1);
        paint.addShape(rec2);
        paint.addShape(rec3);
        paint.addShape(tri1);
        paint.addShape(tri2);
        paint.drawAll();
        paint.printAll();
        paint.describeEquallySidedShapes();
    }
}
