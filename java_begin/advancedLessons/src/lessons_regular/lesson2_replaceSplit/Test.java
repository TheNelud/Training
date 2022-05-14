package lessons_regular.lesson2_replaceSplit;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String a = "Hello.there.hey";
        String b = "Heele234r234rfdf234re";
        String[] wordsa =  a.split("\\.");
        String[] wordsb =  b.split("\\d+");

        System.out.println(Arrays.toString(wordsa));
        System.out.println(Arrays.toString(wordsb));

        String c = "Hello1232there231231hey";
        System.out.println(c.replaceAll("\\d+", " "));

        String modifedString = c.replaceFirst("\\d+", " ");
        System.out.println(modifedString);


    }
}
