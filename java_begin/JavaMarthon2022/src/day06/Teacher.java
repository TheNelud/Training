package day06;

import java.util.Random;

public class Teacher {
    private String name;
    private  String lesson;

    public Teacher(String name, String lesson){
        this.name = name;
        this.lesson = lesson;
    }

    public void evaluate(Student student){
        Random random = new Random();
        int mark = random.nextInt(5);
        String markStr = null;
        switch (mark){
            case 0, 1, 2 -> markStr = "Неудовлетворительно";
            case 3 -> markStr = "Удовлетворительно";
            case 4 -> markStr = "Хорошо";
            case 5 -> markStr = "Отлично";
        }
        System.out.println("Преподователь " + name + " оценил студента с именем " + student.getName() + " по предмету "+ lesson + " на оценку " + markStr);

    }

}
