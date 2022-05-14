package lesson48_enum;

public enum Seasons {
    SUMMER(30), WINTER(-10), AUTUMN(10), SPRING(10);

    private int temperature;

    Seasons(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
