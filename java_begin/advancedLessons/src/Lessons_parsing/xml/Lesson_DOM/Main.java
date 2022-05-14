package Lessons_parsing.xml.Lesson_DOM;


import Lessons_parsing.xml.Lesson_DOM.model.Root;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        Root root = parser.parse();
    }


}
