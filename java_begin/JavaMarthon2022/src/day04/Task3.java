package day04;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12, n = 8;
        int tmp = 0, id = 0;
        Random random = new Random();
        int[][] array_matrix = new int[m][n]; //(m-размер по строкам, n-размер по колонкам)

        for (int i = 0; i < array_matrix.length; i++){
            for (int j = 0; j < array_matrix[i].length; j++){
                array_matrix[i][j] = random.nextInt(50);
            }
        }

        for (int i = 0; i < array_matrix.length; i++){
            int summ = 0;
            for (int j = 0; j< array_matrix[i].length; j++){
                summ += array_matrix[i][j];
            }
            System.out.println("Сумма "+ (i+1) +" строки равна: " + summ);
            if (summ > tmp ){
                tmp = summ;
                id = i;

            }

        }
        System.out.println("Максимальная сумма: " + tmp + " id: " + id);
    }
}
