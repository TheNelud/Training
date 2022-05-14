package day09;

public class Triangle extends Figure{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double p2 = (getSideA()+getSideB()+getSideC())/2; //полупериметр
        return Math.sqrt(p2*(p2-getSideA())*(p2-getSideB())*(p2-getSideC()));// по формуле Герона
    }

    @Override
    public double perimeter() {
        return getSideA()+getSideB()+getSideC();
    }
}
