import java.util.Iterator;
import java.util.ArrayList;

public class Canvas {
    private ArrayList<Shape> shapes;

    public Canvas() {
        this.shapes = new ArrayList<Shape>();
    }

    public Canvas(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public void draw() {
        Iterator<Shape> itr = this.shapes.iterator();
        while(itr.hasNext()) {
            Shape shape = itr.next();
            System.out.println(shape.getType());
            shape.draw();
            System.out.println();
        }
    }

}