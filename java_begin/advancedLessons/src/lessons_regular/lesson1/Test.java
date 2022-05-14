package lessons_regular.lesson1;

import java.awt.*;

public class Test {
    public static void main(String[] args) {

        /*
        * \\d - одна цифра
        * \\w -одна английская буква [a-zA-Z]
        *
        *  + - 1 или более цифр
        *  * - ноль или более цифр
        *  ? - 0 или 1 символов до
        *
        *  ( | ) - множество разделяется или
        *
        *  [a-zA-Z] - опишем все английские буквы, [abc] = (a|b|c)
        *  [0-9] - \\d
        *
        *   [^abc] - мы хотим все символы кроме abc
        *   . - любой символ
        *
        *   {2} - два символа до (\\d{2})
        *   {2, } - 2 или более символа (\\d{2, })
        *   {2,4} - от 2 до 4 симолов (\\d{2,4})
        * */
        String a = "-7";
        String b = "342";
        String c = "+4124";
        System.out.println(a.matches("(-|\\+)?\\d*")); //сравнивает строки
        System.out.println(b.matches("(-|\\+)?\\d*")); //сравнивает строки
        System.out.println(c.matches("(-|\\+)?\\d*")); //сравнивает строки

        String d = "gfdsf33311df2312";
        System.out.println(d.matches("[a-zA-Z31]+\\d+"));

        String e = "haello";
        System.out.println(e.matches("[^abc]*"));

        String url1 = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        System.out.println(url1.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));

        String f = "13";
        System.out.println(f.matches("\\d{2}"));
    }
}
