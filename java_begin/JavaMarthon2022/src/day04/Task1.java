package day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Задача 1");
        System.out.print("Введите длинну массива: ");
        int n = scanner.nextInt();
        int count_8 = 0, count_1 = 0, count_even = 0, count_odd = 0, summ = 0;

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(10);

            if (array[i] > 8){
                count_8 ++;
            }else if(array[i] == 1){
                count_1 ++;
            }

            if (array[i] % 2 == 0){
                count_even ++;
            }else {
                count_odd++;
            }

            summ += array[i];
        }

        System.out.println("Содержимое массива: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива: "+ array.length);
        System.out.println("Кол-во чисел больше 8: " + count_8);
        System.out.println("Кол-во чисел равные 1: " + count_1);
        System.out.println("Кол-во четных чисел: " + count_even);
        System.out.println("Кол-во нечетных чисел: " + count_odd);
        System.out.println("Сумма всех элементов массива: " + summ);
    }
}
