package day06;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model){
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int year_user){
        int result = 0;
        if (year_user > year){
            result = year_user - year;
        }else {
            result = year - year_user;
        }
        return result;
    }
}
