public abstract class Shape {
    private String color;
    private int positionX;
    private int positionY;

    public Shape(String color, int positionX, int positionY) {
        this.setColor(color);
        this.setPositionX(positionX);
        this.setPositionY(positionY);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public String getColor() {
        return this.color;
    }

    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }

    public abstract void draw();

    public abstract String getType();

}