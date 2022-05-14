package day04;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int max_element = 0, min_element = 10000, count_10 = 0, sum_10 = 0;

        int[] array2 = new int[100];
        for(int i = 0; i < array2.length; i++){
            array2[i]= rand.nextInt(10000);
        }

        for (int element:array2){
            if (element > max_element){
                max_element = element;
            }
            if (element < min_element){
                min_element = element;
            }
            if (element % 10 == 0){
                count_10 ++;
                sum_10 += element;
            }


        }
        System.out.println("Наибольший элемент массива: " + max_element);
        System.out.println("Наименьший элемент массива: " + min_element);
        System.out.println("Кол-во элементов массива, оканчивающихся на 0: " + count_10);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum_10);
    }
}
