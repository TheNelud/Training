package day09;

public class Task2 {
    public static void main(String[] args) {
        Figure[] figures = {new Triangle("RED",10 ,10, 10),
                new Triangle("GREEN",10 ,20, 30),
                new Triangle("RED",10 ,20, 15),
                new Rectangle("RED", 5, 10),
                new Rectangle("ORANGE", 40,15),
                new Circle("RED", 4),
                new Circle("RED", 10),
                new Circle("BLUE", 5)
        };


        System.out.println("Сумма красных периметров равна " + calculateRedPerimeter(figures));
        System.out.println("Сумма красных площадей равна " + calculateRedArea(figures));


    }

    public static double calculateRedPerimeter(Figure[] figures){
        double summaPerimetrov = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("RED")) {
                summaPerimetrov += figure.area();
            }
        }

        return summaPerimetrov;
    }

    public static double calculateRedArea(Figure[] figures){
        double summaArea = 0;
        for (Figure figure : figures){
            if (figure.getColor().equals("RED")){
                summaArea += figure.perimeter();
            }
        }
        return summaArea;
    }
}
