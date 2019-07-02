public class Box extends Shape {
    private double width;
    private double height;

    public Box(double width, double height, String color, int positionX, int positionY) {
        super(color, positionX, positionY);
        this.setWidth(width);
        this.setHeight(height);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public void draw() {
        System.out.println("Width: " + this.getWidth() + " Height: " + this.getHeight() + " Color: " + super.getColor() + " Position: (" + super.getPositionX() + ", " + super.getPositionY() + ")");
    }

    @Override
    public String getType() {
        return "Box";
    }

}