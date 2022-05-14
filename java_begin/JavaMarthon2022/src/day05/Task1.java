package day05;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("черная");
        car.setModel("Audi A5");
        car.setYear(2022);

        System.out.println("Год: " + car.getYear() +
                            "\nМодель: " + car.getModel() +
                            "\nЦвет: " + car.getColor());


        Motorbike motorbike = new Motorbike(2022, "синий", "honda s500");
        System.out.println("Год: " + motorbike.getYear() +
                "\nМодель: " + motorbike.getModel() +
                "\nЦвет: " + motorbike.getColor());
    }
}
