package Lessons_parsing.xml.Lesson_SAX;

import Lessons_parsing.xml.Lesson_SAX.model.Root;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        Root root = parser.parse();

        System.out.println("Root: " + root.toString());
    }
}
