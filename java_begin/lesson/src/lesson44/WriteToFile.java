package lesson44;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\lesson44\\Test.txt");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Hello bich!");
        pw.println("Test row 2");

        pw.close();

    }
}
