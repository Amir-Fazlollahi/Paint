import java.util.ArrayList;

public class Paint {
    ArrayList<Shape> shapes;
    public Paint() {
        shapes = new ArrayList<>();
    }
    public void addShape(Shape newShape) {
        shapes.add(newShape);
    }
    public void drawAll() {
        for (Shape shape:
                shapes) {
            shape.draw();
        }
    }
    public void printAll() {
        for (Shape shape:
                shapes) {
            System.out.println(shape);
        }
    }
    public void describeEquallySidedShapes(){
        for (Shape shape:
             shapes) {
            if(shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                if(rectangle.isSquare())
                    System.out.println(rectangle);
            }
            else if(shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                if(triangle.isEquilateral())
                    System.out.println(triangle);
            }
        }
    }
}
