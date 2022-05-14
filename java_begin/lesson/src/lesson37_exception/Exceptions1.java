package lesson37_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Exceptions1 {

    public static void main(String[] args) {
//        String path = "src\\lesson36\\Files\\test.txt";
//        File file = new File(path);
//        try {
//            System.out.println("До бллока сканнер");
//            Scanner scanner = new Scanner(file);
//            System.out.println("После бллока сканнер");
//        } catch (FileNotFoundException e) {
//            System.out.println("Все говно!");
////            e.printStackTrace();
//        }
//
//        System.out.println("После блока try catch");
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения");
        }
    }

    public static void readFile() throws FileNotFoundException {
        String path = "src\\lesson36\\Files\\tests.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

    }

}
