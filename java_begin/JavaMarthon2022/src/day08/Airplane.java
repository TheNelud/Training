package day08;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        System.out.println("Изготовитель: " + producer +"\nгод выпуска: " + year +"\nдлина: "+ length + "\nвес: " + weight+ "\nТопливо в баке: "+ getFuel());
    }


    public void info(){
        System.out.println("Изготовитель: " + producer +"\nгод выпуска: " + year +"\nдлина: "+ length + "\nвес: " + weight+ "\nТопливо в баке: "+ getFuel());
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void fiilUp(int fuelAdd){
        fuel += fuelAdd;
    }

    public int getFuel() {
        return fuel;
    }


}
