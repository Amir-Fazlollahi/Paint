public class Main {
    public static void main(String[] args) {
        Paint paint = new Paint();
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        Rectangle rec1 = new Rectangle(1, 4);
        Rectangle rec2 = new Rectangle(8, 5);
        Rectangle rec3 = new Rectangle(6, 6);
        Triangle tri1 = new Triangle(2, 2, 2);
        Triangle tri2 = new Triangle(4, 4, 6);
        paint.addCircle(circle1);
        paint.addCircle(circle2);
        paint.addRectangle(rec1);
        paint.addRectangle(rec2);
        paint.addRectangle(rec3);
        paint.addTriangle(tri1);
        paint.addTriangle(tri2);
        paint.drawAll();
        paint.printAll();
    }
}
