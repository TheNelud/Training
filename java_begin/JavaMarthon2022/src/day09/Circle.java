package day09;

public class Circle extends Figure{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * Math.pow(getRadius(), 2) ;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * getRadius();
    }
}
