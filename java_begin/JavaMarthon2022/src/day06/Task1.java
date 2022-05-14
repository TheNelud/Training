package day06;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike motorbike = new Motorbike(2003, "Red", "Honda");

        car.info();
        System.out.println("Результат автомобиля: " + car.yearDifference(2033));
        motorbike.info();
        System.out.println("Результат мотоцикла: " + motorbike.yearDifference(1999));



    }
}
