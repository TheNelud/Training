package day04;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int tmp = 0, id = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }
        System.out.println("Массив \n" + Arrays.toString(array));

        for (int i = 0; i < array.length-2; i++){
            int summ = 0;
            for(int j = i; j < i + 3; j++){
                summ += array[j];
            }
//            summ = array[i] + array[i+1] +array[i+2];
            if (summ > tmp){
                tmp = summ;
                id = i;
            }
            System.out.println("Сумма равна: " + summ);
        }
        System.out.println("Наибольшая cумма равна: " + tmp + " id: "+ id);
    }
}
