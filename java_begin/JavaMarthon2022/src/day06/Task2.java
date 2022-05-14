package day06;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Aeroflot", 1976, 50, 2000);
        airplane.info();
        airplane.setYear(2000);
        airplane.setLength(34);
        airplane.fiilUp(100);
        airplane.fiilUp(33);
        airplane.info();
    }
}
