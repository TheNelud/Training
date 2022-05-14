package day03;

import java.util.Objects;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 1");

        while (true){
            String contry = scanner.nextLine();
            if (contry.equals("STOP")){
                break;
            }
            switch (contry){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    continue;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    continue;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    continue;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    continue;
                default:
                    System.out.println("Неизвестная страна");

            }
        }

        System.out.println("Задача 2");
        while(true){
            double divisible = scanner.nextDouble();
            double divisor = scanner.nextDouble();

            if (divisor == 0 ){break;}
            double result = divisible / divisor;
            System.out.println( "Result: " + result);
        }

        System.out.println("Задача 3");
        for (int i = 0; i < 5; i++){
            double divisible = scanner.nextDouble();
            double divisor = scanner.nextDouble();

            if (divisor == 0 ){
                System.out.println("Деление на 0");
                continue;
            }
            double result = divisible / divisor;
            System.out.println( "Result: " + result);


        }
    }
}
