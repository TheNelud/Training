package day09;

import javax.sound.midi.Soundbank;

public class Teacher extends Human{
    private String lesson;

    public Teacher(String name, String lesson) {
        super(name);
        this.lesson = lesson;

    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподователь с именем " + super.getName());
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
