import java.util.ArrayList;

public class Paint {
    ArrayList<Triangle> triangles;
    ArrayList<Rectangle> rectangles;
    ArrayList<Circle> circles;
    public Paint() {
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
        circles = new ArrayList<>();
    }
    public void addTriangle(Triangle newTriangle) {
        triangles.add(newTriangle);
    }
    public void addRectangle(Rectangle newRectangle) {
        rectangles.add(newRectangle);
    }
    public void addCircle(Circle newCircle) {
        circles.add(newCircle);
    }
    public void drawAll() {
        for (Triangle triangle:
             triangles) {
            triangle.draw();
        }
        for (Rectangle rectangle:
                rectangles) {
            rectangle.draw();
        }
        for (Circle circle:
                circles) {
            circle.draw();
        }
    }
    public void printAll() {
        for (Triangle triangle:
                triangles) {
            System.out.println(triangle);
        }
        for (Rectangle rectangle:
                rectangles) {
            System.out.println(rectangle);
        }
        for (Circle circle:
                circles) {
            System.out.println(circle);
        }
    }
}
