package day07;

import java.util.Random;

public class Player {

    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(){
        Random random = new Random();
        stamina = random.nextInt(90, MAX_STAMINA);
        countPlayers ++;
    }

    public void run(){
        stamina --;
        System.out.println(stamina);
        if (stamina == MIN_STAMINA){
            countPlayers --;
        }
    }

    public static void info(){
        if (countPlayers < 6){
            System.out.println("Команды неполные, ");
            switch (countPlayers){
                case 1 -> System.out.print("на поле есть пять свободных мест");
                case 2 -> System.out.print("на поле есть четыре свободных места");
                case 3 -> System.out.print("на поле есть три свободных места");
                case 4 -> System.out.print("на поле есть два свободных места");
                case 5 -> System.out.print("на поле есть одно свободное место");
            }
        }else{
            System.out.println("На поле нет свободных мест!");
        }
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }
}
