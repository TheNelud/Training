package day02;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 1");
        int floor = scanner.nextInt();
        if (floor == 1 || floor == 2 || floor == 3 || floor ==4){
            System.out.println("Малоэтажный дом");
        }else if(floor == 5 || floor == 6 || floor == 7 || floor == 8){
            System.out.println("Среднеэтажный дом");
        }else if(floor >= 9){
            System.out.println("Многоэтажный дом");
        }else {
            System.out.println("Ошибка ввода");
        }

        System.out.println("Задача 2");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Вывод: ");
        for(int i = a; i <= b; i++){
            if (a >= b){
                System.out.println("Некорректный ввод");
            }else if (i % 5 == 0 && i % 10 != 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\nЗадача 3");
        System.out.print("Вывод: ");
        while (a < b){
            if (a >= b){
                System.out.println("Некорректный ввод");
            }else if (a % 5 == 0 && a % 10 != 0){
                System.out.print(a + " ");
            }
            a++;
        }

        System.out.println("\nЗадача 4");
        double x = scanner.nextDouble();
        double y ;
        if (x >= 5){
            y = ((Math.pow(x, 2) - 10 ) / (x + 7));
            System.out.println("1. Уравнение y = " + y);
        }else if(x > -3 && x < 5){
            y = (x + 3) * (Math.pow(x, 2)-2);
            System.out.println("2. Уравнение y = " + y);
        }else {
            y = 420;
            System.out.println("3. y = " + y);
        }


    }
}
