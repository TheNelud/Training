package lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separate = File.separator;
//        String path = "G:\\Code\\alishev_tutorial\\lesson\\src\\lesson36\\Files\\test.txt"; // + separator +

        File file = new File("src\\lesson36\\Files\\test.txt");

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");//разделяет через пробел
//        System.out.println(Arrays.toString(numbers));
        int[] numbers = new int[3];
        int counter = 0;

        for (String number : numbersString) {
           numbers[counter++] = Integer.parseInt(number);

        }
        System.out.println(Arrays.toString(numbers));

//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
        scanner.close();
    }
}
