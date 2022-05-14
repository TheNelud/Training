package lesson39_exception3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        //Checked Exception(Compile time exception) =
        // исключительные случаи в работе программе
//        File file = new File("Rew");
//        try {
//            Scanner scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //Unchecked (Runtime exception)=
        // ошибка в работе
//        int a = 1/0;
//        String name = null;
//        name.length();

        int[] arr = new int[2];
        System.out.println(arr[2]);


    }
}
