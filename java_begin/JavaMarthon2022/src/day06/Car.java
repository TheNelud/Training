package day06;

public class Car {
    private int year;
    private String color;
    private String model;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;

    }

    public void info(){
        System.out.println("Это автомобиль");
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
