public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, int positionX, int positionY) {
        super(color, positionX, positionY);
        this.setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Radius: " + this.getRadius() + " Color: " + super.getColor()
                + " Position: (" + super.getPositionX() + ", " + super.getPositionY() + ")");
    }

    @Override
    public String getType() {
        return "Circle";
    }

}