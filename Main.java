import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        Box b1 = new Box(40, 10, "Red", 90, 31);
        Box b2 = new Box(20, 20, "Black", 30, 50);
        Circle c1 = new Circle(5, "Green", 50, 90);
        Canvas canvas = new Canvas(new ArrayList<Shape>(Arrays.asList(b1, b2)));
        canvas.addShape(c1);
        canvas.draw();
    }
}