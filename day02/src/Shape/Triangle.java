package Shape;

public class Triangle extends Shape {
    private int width;
    private int height;

    public  Triangle() {}

    public Triangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }


    @Override
    public double getArea() {
        return width * height / 2;
    }

    @Override
    public double getCircumference() {
        return Math.sqrt(Math.pow(width,2) + Math.pow(height,2)) + width + height;
    }
}
