package day09;

public class Rectangle extends Figure{
    private double height;
    private double weight;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Rectangle(String color, double height, double weight) {
        super(color);
        this.height = height;
        this.weight = weight;

    }

    @Override
    public double area() {
        return getHeight() * getWeight();
    }

    @Override
    public double perimeter() {
        return 2 * (getHeight() + getWeight());
    }
}
